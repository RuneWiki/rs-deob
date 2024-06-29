import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class457 {
   @OriginalMember(
      owner = "client!st",
      name = "i",
      descriptor = "Z"
   )
   public boolean field6926 = true;
   @OriginalMember(
      owner = "client!st",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6934 = new String[]{method3440(method3439("\t;sp@")), method3440(method3439("\t;su@")), method3440(method3439("\t;st@")), method3440(method3439("\u0001as\u001f\u0015")), method3440(method3439("\t;ss@")), method3440(method3439("\u0014:1]")), method3440(method3439("\t;sr@"))};
   @OriginalMember(
      owner = "client!st",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field6931 = new int[32];
   @OriginalMember(
      owner = "client!st",
      name = "b",
      descriptor = "C"
   )
   private char field6927;
   @OriginalMember(
      owner = "client!st",
      name = "g",
      descriptor = "I"
   )
   public static int field6924;
   @OriginalMember(
      owner = "client!st",
      name = "h",
      descriptor = "I"
   )
   public static int field6925;
   @OriginalMember(
      owner = "client!st",
      name = "e",
      descriptor = "I"
   )
   public static int field6928;
   @OriginalMember(
      owner = "client!st",
      name = "j",
      descriptor = "I"
   )
   public static int field6932;
   @OriginalMember(
      owner = "client!st",
      name = "d",
      descriptor = "I"
   )
   public int field6933;
   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "Lce;"
   )
   public static class324 field6929;
   @OriginalMember(
      owner = "client!st",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public String field6930;

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(Ljj;IB)V",
      line = 3
   )
   private final void method3434(class128 arg0, int arg1, byte arg2) {
      int var4 = client.field4530;

      try {
         label52: {
            if (arg1 == 1) {
               this.field6927 = class296.method2252(arg0.method1047((byte)-126), arg2 ^ -3);
               if (var4 == 0) {
                  break label52;
               }
            }

            if (arg1 != 2) {
               if (arg1 == 4) {
                  this.field6926 = false;
                  if (var4 == 0) {
                     break label52;
                  }
               }

               if (~arg1 != -6) {
                  break label52;
               }

               this.field6930 = arg0.method1083((byte)127);
               if (var4 == 0) {
                  break label52;
               }
            }

            this.field6933 = arg0.method1041(4758);
         }

         if (arg2 != -3) {
            this.method3434((class128)null, -52, (byte)117);
         }

         ++field6925;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6934[6] + (arg0 != null ? field6934[3] : field6934[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "b",
      descriptor = "(I)V",
      line = 34
   )
   public static void method3435(int arg0) {
      try {
         field6931 = null;
         field6929 = null;
         if (arg0 < 13) {
            field6931 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6934[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(I)Z",
      line = 45
   )
   public final boolean method3436(int arg0) {
      try {
         ++field6924;
         if (arg0 != 777) {
            this.field6926 = false;
         }

         return this.field6927 == 's';
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6934[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(III)Z",
      line = 62
   )
   public static final boolean method3437(int arg0, int arg1, int arg2) {
      try {
         ++field6932;
         if (arg1 < 90) {
            field6929 = null;
         }

         return class321.method2430(50, arg0, arg2) || class69.method691(arg0, arg2, 30);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6934[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(ILjj;)V",
      line = 80
   )
   public final void method3438(int arg0, class128 arg1) {
      int var3 = client.field4530;

      try {
         while(true) {
            int var4 = arg1.method1104(arg0 ^ 251);
            if (var4 != 0) {
               this.method3434(arg1, var4, (byte)-3);
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            }

            ++field6928;
            break;
         }

         if (arg0 != 4) {
            field6931 = null;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6934[4] + arg0 + ',' + (arg1 != null ? field6934[3] : field6934[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3439(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!st",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3440(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
