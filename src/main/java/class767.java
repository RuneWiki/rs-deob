import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class767 {
   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11258 = new String[]{method5557(method5556("A}(U\u0018")), method5557(method5556("A}(V\u0018")), method5557(method5556("^djx")), method5557(method5556("K?(:M")), method5557(method5556("A}(W\u0018"))};
   @OriginalMember(
      owner = "client!ql",
      name = "c",
      descriptor = "I"
   )
   public static int field11252 = 0;
   @OriginalMember(
      owner = "client!ql",
      name = "d",
      descriptor = "Lsda;"
   )
   public static class269 field11254 = new class269(86, 6);
   @OriginalMember(
      owner = "client!ql",
      name = "g",
      descriptor = "I"
   )
   public static int field11251;
   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "I"
   )
   public static int field11253;
   @OriginalMember(
      owner = "client!ql",
      name = "b",
      descriptor = "I"
   )
   public static int field11255;
   @OriginalMember(
      owner = "client!ql",
      name = "e",
      descriptor = "I"
   )
   public static int field11256;
   @OriginalMember(
      owner = "client!ql",
      name = "f",
      descriptor = "I"
   )
   public static int field11257;

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(I)V",
      line = 15
   )
   public static void method5553(int arg0) {
      try {
         field11254 = null;
         if (arg0 < 27) {
            field11252 = -123;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11258[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(BLch;)I",
      line = 30
   )
   public static final int method5554(byte arg0, class488 arg1) {
      try {
         ++field11255;
         if (arg0 < 52) {
            field11252 = -109;
         }

         String var2 = class417.method3193(-32167, arg1);
         return class173.field2160.method5526(var2, class75.field966, 116);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11258[1] + arg0 + ',' + (arg1 != null ? field11258[3] : field11258[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(BB)V",
      line = 48
   )
   public static final void method5555(byte arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         if (class393.field5962 == null) {
            class393.field5962 = new byte[4][class323.field4603][class178.field2197];
         }

         ++field11256;
         if (arg1 > -102) {
            method5553(-26);
         }

         int var3 = 0;
         if (var2 != 0 || var3 < 4) {
            do {
               int var4 = 0;
               if (var2 != 0 || var4 < class323.field4603) {
                  do {
                     int var5 = 0;
                     if (var2 != 0) {
                        class393.field5962[var3][var4][var5] = arg0;
                        ++var5;
                     }

                     while(true) {
                        while(var5 < class178.field2197) {
                           class393.field5962[var3][var4][var5] = arg0;
                           ++var5;
                        }

                        if (var2 == 0) {
                           ++var4;
                           break;
                        }

                        ++var5;
                     }
                  } while(var4 < class323.field4603);
               }

               ++var3;
            } while(var3 < 4);

         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11258[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5556(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5557(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
