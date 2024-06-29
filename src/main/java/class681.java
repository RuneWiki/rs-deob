import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class681 {
   @OriginalMember(
      owner = "client!rs",
      name = "g",
      descriptor = "Z"
   )
   public boolean field10033 = false;
   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10035 = new String[]{method4972(method4971("/\u001553`")), method4972(method4971("/\u001556`")), method4972(method4971("&H5\\5")), method4972(method4971("3\u0013w\u001e")), method4972(method4971("/\u001557`")), method4972(method4971("/\u001550`")), method4972(method4971("/\u001551`"))};
   @OriginalMember(
      owner = "client!rs",
      name = "j",
      descriptor = "I"
   )
   public static int field10030 = 0;
   @OriginalMember(
      owner = "client!rs",
      name = "f",
      descriptor = "I"
   )
   public static int field10024 = 0;
   @OriginalMember(
      owner = "client!rs",
      name = "d",
      descriptor = "I"
   )
   public static int field10031 = 0;
   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field10034 = false;
   @OriginalMember(
      owner = "client!rs",
      name = "l",
      descriptor = "I"
   )
   public static int field10022;
   @OriginalMember(
      owner = "client!rs",
      name = "k",
      descriptor = "I"
   )
   public int field10023;
   @OriginalMember(
      owner = "client!rs",
      name = "e",
      descriptor = "I"
   )
   public static int field10025;
   @OriginalMember(
      owner = "client!rs",
      name = "c",
      descriptor = "I"
   )
   public static int field10026;
   @OriginalMember(
      owner = "client!rs",
      name = "h",
      descriptor = "I"
   )
   public int field10027;
   @OriginalMember(
      owner = "client!rs",
      name = "i",
      descriptor = "I"
   )
   public static int field10029;
   @OriginalMember(
      owner = "client!rs",
      name = "b",
      descriptor = "Lfs;"
   )
   public static class582 field10032;
   @OriginalMember(
      owner = "client!rs",
      name = "m",
      descriptor = "Llj;"
   )
   public class635 field10028;

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(Lha;IIZ)Lbg;"
   )
   public final class492 method4966(class66 arg0, int arg1, int arg2, boolean arg3) {
      boolean var5 = client.field4360;

      try {
         ++field10029;
         long var6 = (long)(arg0.field796 << 19 | (!arg3 ? 0 : 262144) | this.field10027 | arg2 << 16);
         class492 var8 = (class492)this.field10028.field9285.method725(0, var6);
         if (var8 != null) {
            return var8;
         } else if (!this.field10028.field9276.method2051(this.field10027, (byte)60)) {
            return null;
         } else {
            class439 var9 = class439.method3239(this.field10028.field9276, this.field10027, 0);
            if (arg1 < 108) {
               this.field10027 = -128;
            }

            if (var9 != null) {
               var9.field6263 = var9.field6265 = var9.field6266 = var9.field6262 = 0;
               if (arg3) {
                  var9.method3238();
               }

               int var10 = 0;
               if (var5) {
                  var9.method3243();
                  ++var10;
               }

               while(var10 < arg2) {
                  var9.method3243();
                  ++var10;
               }
            }

            class492 var11 = arg0.method500(var9, true);
            if (var11 != null) {
               this.field10028.field9285.method723(0, var6, var11);
            }

            return var11;
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field10035[4] + (arg0 != null ? field10035[2] : field10035[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method4967(int arg0) {
      try {
         if (arg0 != 0) {
            return true;
         } else {
            ++field10026;
            return this.field10028.field9276.method2051(this.field10027, (byte)60);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10035[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(IILwf;)V"
   )
   private final void method4968(int arg0, int arg1, class147 arg2) {
      boolean var4 = client.field4360;

      try {
         if (arg0 != -1562267789) {
            field10030 = -35;
         }

         label45: {
            if (~arg1 != -2) {
               if (~arg1 != -3) {
                  if (arg1 == 3) {
                     this.field10033 = true;
                     if (!var4) {
                        break label45;
                     }
                  }

                  if (~arg1 != -5) {
                     break label45;
                  }

                  this.field10027 = -1;
                  if (!var4) {
                     break label45;
                  }
               }

               this.field10023 = arg2.method1166((byte)-95);
               if (!var4) {
                  break label45;
               }
            }

            this.field10027 = arg2.method1211(-26166);
         }

         ++field10025;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10035[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10035[2] : field10035[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(ILwf;)V"
   )
   public final void method4969(int arg0, class147 arg1) {
      boolean var3 = client.field4360;

      try {
         while(true) {
            int var4 = arg1.method1143(-15465);
            if (var4 != 0) {
               this.method4968(-1562267789, var4, arg1);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field10022;
            break;
         }

         if (arg0 != 0) {
            this.method4969(40, (class147)null);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10035[1] + arg0 + ',' + (arg1 != null ? field10035[2] : field10035[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4970(int arg0) {
      try {
         if (arg0 == 0) {
            field10032 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10035[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4971(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4972(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
