import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class738 extends class389 {
   @OriginalMember(
      owner = "client!ki",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10779 = new String[]{method5359(method5358("B\u0003\u0018Ox")), method5359(method5358("B\u0003\u0018Jx")), method5359(method5358("G\u001fZe")), method5359(method5358("RD\u0018'-")), method5359(method5358("B\u0003\u0018Lx")), method5359(method5358("B\u0003\u0018Hx")), method5359(method5358("B\u0003\u0018Kx")), method5359(method5358("B\u0003\u0018Mx"))};
   @OriginalMember(
      owner = "client!ki",
      name = "G",
      descriptor = "Leg;"
   )
   public static class118 field10769 = new class118(42, 10);
   @OriginalMember(
      owner = "client!ki",
      name = "D",
      descriptor = "Lek;"
   )
   public static class536 field10776 = new class536(25, 7);
   @OriginalMember(
      owner = "client!ki",
      name = "E",
      descriptor = "[I"
   )
   public static int[] field10778 = new int[]{1, 4, 1, 2};
   @OriginalMember(
      owner = "client!ki",
      name = "I",
      descriptor = "Z"
   )
   public static boolean field10777 = true;
   @OriginalMember(
      owner = "client!ki",
      name = "M",
      descriptor = "I"
   )
   public static int field10770;
   @OriginalMember(
      owner = "client!ki",
      name = "K",
      descriptor = "I"
   )
   public static int field10772;
   @OriginalMember(
      owner = "client!ki",
      name = "L",
      descriptor = "I"
   )
   public static int field10773;
   @OriginalMember(
      owner = "client!ki",
      name = "J",
      descriptor = "I"
   )
   public static int field10774;
   @OriginalMember(
      owner = "client!ki",
      name = "F",
      descriptor = "I"
   )
   public static int field10775;
   @OriginalMember(
      owner = "client!ki",
      name = "N",
      descriptor = "Lkf;"
   )
   public static class266 field10771;

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(IBII)V",
      line = 3
   )
   public final void method778(int arg0, byte arg1, int arg2, int arg3) {
      try {
         super.field5638 = arg2;
         super.field5645 = arg0;
         ++field10774;
         if (arg1 >= -121) {
            field10771 = null;
         }

         super.field5639 = arg3;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10779[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(IB)I",
      line = 16
   )
   public static final int method5354(int arg0, byte arg1) {
      try {
         ++field10773;
         if (arg1 <= 12) {
            field10778 = null;
         }

         return arg0 >>> 10;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10779[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(IF)V",
      line = 27
   )
   public final void method777(int arg0, float arg1) {
      try {
         if (arg0 != -12978) {
            this.method777(-65, -1.4087938F);
         }

         ++field10772;
         super.field5649 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10779[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "b",
      descriptor = "(B)V",
      line = 39
   )
   public static void method5355(byte arg0) {
      try {
         field10771 = null;
         field10776 = null;
         if (arg0 >= -40) {
            field10777 = false;
         }

         field10769 = null;
         field10778 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10779[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "<init>",
      descriptor = "(IIIIIF)V",
      line = 52
   )
   public class738(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(III)Z",
      line = 55
   )
   public static final boolean method5356(int arg0, int arg1, int arg2) {
      try {
         ++field10770;
         return arg2 != -25085 ? true : class207.method1643(arg0, arg1, (byte)60) & class428.method3168(arg0, (byte)-126, arg1);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10779[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "b",
      descriptor = "(ILjava/lang/String;)Ljava/lang/String;",
      line = 66
   )
   public static final String method5357(int arg0, String arg1) {
      boolean var2 = client.field4360;

      try {
         ++field10775;
         if (arg1 == null) {
            return null;
         } else {
            int var3;
            int var4;
            int var10000;
            label121: {
               var3 = 0;
               var4 = arg1.length();
               if (var2) {
                  ++var3;
               }

               label113:
               while(true) {
                  if (~var4 < ~var3) {
                     var10000 = class371.method2833(-24, arg1.charAt(var3));
                     if (!var2) {
                        if (var10000 != 0) {
                           ++var3;
                           continue;
                        }

                        if (var2) {
                           --var4;
                        }

                        var10000 = var3;
                     }
                  } else {
                     var10000 = var3;
                  }

                  while(true) {
                     if (var10000 >= var4) {
                        break label113;
                     }

                     var10000 = class371.method2833(-78, arg1.charAt(var4 - 1));
                     if (var2) {
                        break label121;
                     }

                     if (var10000 == 0) {
                        break label113;
                     }

                     --var4;
                     var10000 = var3;
                  }
               }

               var10000 = -var3 + var4;
            }

            int var5 = var10000;
            if (~var5 <= -2 && ~var5 >= -13) {
               StringBuffer var6 = new StringBuffer(var5);
               int var7 = var3;
               char var9;
               if (arg0 > -18) {
                  field10769 = null;
                  if (var2) {
                     char var8 = arg1.charAt(var3);
                     if (class451.method3293(var8, true)) {
                        var9 = class333.method2463(26963, var8);
                        if (var9 != 0) {
                           var6.append(var9);
                        }
                     }

                     var7 = var3 + 1;
                  }
               }

               while(true) {
                  if (var4 <= var7) {
                     var10000 = var6.length();
                     if (!var2) {
                        if (var10000 == 0) {
                           return null;
                        }

                        return var6.toString();
                     }
                  } else {
                     var10000 = arg1.charAt(var7);
                  }

                  int var12 = var10000;
                  if (class451.method3293((char)var12, true)) {
                     var9 = class333.method2463(26963, (char)var12);
                     if (var9 != 0) {
                        var6.append(var9);
                     }
                  }

                  ++var7;
               }
            } else {
               return null;
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field10779[4] + arg0 + ',' + (arg1 != null ? field10779[3] : field10779[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5358(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5359(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
