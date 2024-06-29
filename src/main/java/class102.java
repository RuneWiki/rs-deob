import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class102 {
   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1316 = new String[]{method924(method923("P>IU{")), method924(method923("P>IW{")), method924(method923("P>IV{"))};
   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field1314 = new int[128];
   @OriginalMember(
      owner = "client!sd",
      name = "c",
      descriptor = "I"
   )
   public static int field1313;
   @OriginalMember(
      owner = "client!sd",
      name = "b",
      descriptor = "I"
   )
   public static int field1315;

   @OriginalMember(
      owner = "client!sd",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method919(int arg0) {
      try {
         if (arg0 != 1) {
            field1314 = null;
         }

         field1314 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1316[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(IJ)I"
   )
   public static final int method920(int arg0, long arg1) {
      try {
         if (arg0 != 15405) {
            field1314 = null;
         }

         ++field1315;
         return (int)(arg1 / 86400000L) + -11745;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1316[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "()V"
   )
   public static final void method921() {
      while(true) {
         boolean var0 = true;

         for(int var1 = 0; var1 < class247.field3099.length; ++var1) {
            if (!class247.field3099[var1].method3345()) {
               synchronized(class247.field3099[var1]) {
                  class247.field3099[var1].notify();
               }

               var0 = false;
            } else {
               class711.field10435[var1] = class247.field3099[var1].method3344();
            }
         }

         if (var0) {
            class247.field3099[class247.field3099.length - 1].method3342();
            class100.method910(1);

            while(true) {
               boolean var3 = true;

               for(int var4 = 0; var4 < class247.field3099.length - 1; ++var4) {
                  if (!class247.field3099[var4].method3345()) {
                     synchronized(class247.field3099[var4]) {
                        class247.field3099[var4].notify();
                     }

                     var3 = false;
                  }
               }

               if (var3) {
                  for(int var6 = 1; var6 < class247.field3099.length - 2; ++var6) {
                     class247.field3099[var6].method3342();
                  }

                  class100.method910(2);

                  while(!class247.field3099[0].method3345()) {
                     synchronized(class247.field3099[0]) {
                        class247.field3099[0].notify();
                     }

                     try {
                        class173.method1347(-93, 1L);
                     } catch (Exception var9) {
                     }
                  }

                  class247.field3099[0].method3342();
                  return;
               }

               try {
                  class173.method1347(-121, 1L);
               } catch (Exception var12) {
               }
            }
         }

         try {
            class173.method1347(100, 1L);
         } catch (Exception var8) {
         }
      }
   }

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(I)[Lvja;"
   )
   public static final class290[] method922(int param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      for(int var0 = 0; ~var0 > ~field1314.length; ++var0) {
         field1314[var0] = -1;
      }

      for(int var1 = 65; var1 <= 90; ++var1) {
         field1314[var1] = var1 - 65;
      }

      for(int var2 = 97; var2 <= 122; ++var2) {
         field1314[var2] = var2 + -97 - -26;
      }

      for(int var3 = 48; var3 <= 57; ++var3) {
         field1314[var3] = var3 + -48 - -52;
      }

      field1314[42] = field1314[43] = 62;
      field1314[45] = field1314[47] = 63;
   }

   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method923(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method924(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
