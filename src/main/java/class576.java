import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class576 {
   @OriginalMember(
      owner = "client!lq",
      name = "g",
      descriptor = "Z"
   )
   public boolean field8300 = true;
   @OriginalMember(
      owner = "client!lq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8304 = new String[]{method4261(method4260("W<pN[")), method4261(method4260("@cp%\u000e")), method4261(method4260("W<pJ[")), method4261(method4260("U82g")), method4261(method4260("W<pI[")), method4261(method4260("W<pO[")), method4261(method4260("W<pH["))};
   @OriginalMember(
      owner = "client!lq",
      name = "c",
      descriptor = "C"
   )
   private char field8301;
   @OriginalMember(
      owner = "client!lq",
      name = "e",
      descriptor = "I"
   )
   public static int field8295;
   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "I"
   )
   public int field8296;
   @OriginalMember(
      owner = "client!lq",
      name = "d",
      descriptor = "I"
   )
   public static int field8297;
   @OriginalMember(
      owner = "client!lq",
      name = "h",
      descriptor = "I"
   )
   public static int field8298;
   @OriginalMember(
      owner = "client!lq",
      name = "f",
      descriptor = "I"
   )
   public static int field8302;
   @OriginalMember(
      owner = "client!lq",
      name = "b",
      descriptor = "I"
   )
   public static int field8303;
   @OriginalMember(
      owner = "client!lq",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   public String field8299;

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(ZLuda;)V"
   )
   public final void method4255(boolean arg0, class473 arg1) {
      boolean var3 = client.field4564;

      try {
         ++field8302;
         if (arg0) {
            method4257(87);
         }

         do {
            int var4 = arg1.method3564((byte)-94);
            if (~var4 == -1) {
               break;
            }

            this.method4259(-6, arg1, var4);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8304[5] + arg0 + ',' + (arg1 != null ? field8304[1] : field8304[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method4256(int arg0) {
      try {
         ++field8303;
         if (arg0 > -123) {
            this.field8296 = -70;
         }

         return ~this.field8301 == -116;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8304[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4257(int arg0) {
      try {
         class527.field7681 = false;
         ++field8297;
         if (arg0 != 1) {
            method4257(126);
         }

         class585.method4337((byte)-63);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8304[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(IIILha;IBII)V"
   )
   public static final void method4258(int arg0, int arg1, int arg2, class65 arg3, int arg4, byte arg5, int arg6, int arg7) {
      try {
         ++field8295;
         arg3.method693(10240, arg4, arg1, arg7, arg2, arg0);
         if (arg5 == -127) {
            arg3.method693(10240, arg6, arg1 + -2, 16, arg2 + 1, arg0 + 1);
            arg3.method691((byte)66, arg6, arg7 + -19, arg2 + 18, arg1 + -2, arg0 + 1);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field8304[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8304[1] : field8304[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(ILuda;I)V"
   )
   private final void method4259(int arg0, class473 arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         if (arg0 == -6) {
            label45: {
               if (arg2 != 1) {
                  if (arg2 == 2) {
                     this.field8296 = arg1.method3567(31871);
                     if (!var4) {
                        break label45;
                     }
                  }

                  if (arg2 != 4) {
                     if (~arg2 != -6) {
                        break label45;
                     }

                     this.field8299 = arg1.method3566(arg0 + -16496682);
                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field8300 = false;
                  if (!var4) {
                     break label45;
                  }
               }

               this.field8301 = class85.method847(16, arg1.method3543(-1132613840));
            }

            ++field8298;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8304[4] + arg0 + ',' + (arg1 != null ? field8304[1] : field8304[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4260(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4261(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
