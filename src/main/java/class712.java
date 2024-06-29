import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class712 implements class117 {
   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "I"
   )
   public int field10337;
   @OriginalMember(
      owner = "client!vha",
      name = "g",
      descriptor = "[F"
   )
   public float[] field10338;
   @OriginalMember(
      owner = "client!vha",
      name = "f",
      descriptor = "I"
   )
   public int field10340;
   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10341 = new String[]{method5180(method5179("-q<\b+s")), method5180(method5179("-q<\b)s")), method5180(method5179("5l1J")), method5180(method5179("-q<\b(s")), method5180(method5179(" 7s\b\u0017")), method5180(method5179("-q<\bV2w4RTs"))};
   @OriginalMember(
      owner = "client!vha",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field10334 = false;
   @OriginalMember(
      owner = "client!vha",
      name = "h",
      descriptor = "I"
   )
   public static int field10333;
   @OriginalMember(
      owner = "client!vha",
      name = "c",
      descriptor = "I"
   )
   public static int field10335;
   @OriginalMember(
      owner = "client!vha",
      name = "b",
      descriptor = "I"
   )
   public static int field10336;
   @OriginalMember(
      owner = "client!vha",
      name = "d",
      descriptor = "Lpo;"
   )
   public static class582 field10339;

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(Z)V",
      line = 10
   )
   public static void method5176(boolean arg0) {
      try {
         if (arg0) {
            field10339 = null;
         }

         field10339 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10341[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(B)V",
      line = 23
   )
   public static final void method5177(byte arg0) {
      try {
         if (arg0 == 17) {
            class272.method2147((byte)-119);
            ++field10335;
            class743.method5393(4);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10341[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Z",
      line = 36
   )
   public static final boolean method5178(String arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field10333;
         if (arg0 == null) {
            return false;
         } else {
            int var3 = arg1;
            if (var2) {
               if (arg0.equalsIgnoreCase(class546.field7902[arg1])) {
                  return true;
               }

               if (arg0.equalsIgnoreCase(class29.field454[arg1])) {
                  return true;
               }

               var3 = arg1 + 1;
            }

            while(true) {
               boolean var10000;
               if (var3 >= class791.field11564) {
                  var10000 = false;
                  if (!var2) {
                     return false;
                  }
               } else {
                  var10000 = arg0.equalsIgnoreCase(class546.field7902[var3]);
               }

               if (var10000) {
                  return true;
               }

               if (arg0.equalsIgnoreCase(class29.field454[var3])) {
                  return true;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10341[3] + (arg0 != null ? field10341[4] : field10341[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "<init>",
      descriptor = "(II)V",
      line = 61
   )
   public class712(int arg0, int arg1) {
      try {
         this.field10337 = arg0;
         this.field10338 = new float[arg0 * arg1];
         this.field10340 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10341[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5179(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5180(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
