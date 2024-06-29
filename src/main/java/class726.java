import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public abstract class class726 {
   @OriginalMember(
      owner = "client!eo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10606 = new String[]{method5257(method5256("E\u0014}")), method5257(method5256("\u001e\u0017m\u001c\u0015")), method5257(method5256("\u000bL/^")), method5257(method5256("\u0000Vms@")), method5257(method5256("YZ,^U\u0003_%T\u000e\u0003\u0007c\u001dH"))};
   @OriginalMember(
      owner = "client!eo",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field10603 = false;
   @OriginalMember(
      owner = "client!eo",
      name = "b",
      descriptor = "I"
   )
   public static int field10604;
   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "I"
   )
   public static int field10605;

   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public static final void method5255(int arg0, class479 arg1) {
      boolean var2 = client.field1481;

      try {
         int var3 = -1 % ((arg0 - -69) / 44);
         ++field10605;
         if ((~class455.field6279 <= -3 || class597.field8823) && class584.field8627 == null) {
            String var5;
            label129: {
               if (!class597.field8823 || ~class455.field6279 <= -3) {
                  if (!class327.field4524 || !class15.field273.method2538(true, 81) || ~class455.field6279 >= -3) {
                     class541 var4 = class213.field2705;
                     if (var4 == null) {
                        return;
                     }

                     var5 = class406.method3183(-18170, var4);
                     int[] var6 = null;
                     if (class505.method3816(110, var4.field7909)) {
                        var6 = class166.field2126.method5576((int)var4.field7912, (byte)-94).field7999;
                     } else if (var4.field7913 == -1) {
                        if (class141.method1161(var4.field7909, false)) {
                           class411 var7 = (class411)class35.field493.method1818(-1, (long)((int)var4.field7912));
                           if (var7 != null) {
                              class81 var8 = var7.field5654;
                              class473 var9 = var8.field1135;
                              if (var9.field6583 != null) {
                                 var9 = var9.method3603(class175.field2266, 4764);
                              }

                              if (var9 != null) {
                                 var6 = var9.field6564;
                              }
                           }
                        } else if (class258.method2080(var4.field7909, 25161)) {
                           Object var10 = null;
                           class294 var11;
                           if (var4.field7909 != 1010) {
                              var11 = class438.field5967.method929((byte)-91, (int)(2147483647L & var4.field7912 >>> 32));
                           } else {
                              var11 = class438.field5967.method929((byte)-87, (int)var4.field7912);
                           }

                           if (var11.field4036 != null) {
                              var11 = var11.method2362(class175.field2266, true);
                           }

                           if (var11 != null) {
                              var6 = var11.field4103;
                           }
                        }
                     } else {
                        var6 = class166.field2126.method5576(var4.field7913, (byte)-65).field7999;
                     }

                     if (var6 == null) {
                        break label129;
                     }

                     var5 = var5 + class432.method3345(var6, true);
                     if (!var2) {
                        break label129;
                     }
                  }

                  var5 = class406.method3183(-18170, class213.field2705);
                  if (!var2) {
                     break label129;
                  }
               }

               var5 = class649.field9694 + class606.field8935.method4490(class782.field11389, -16777216) + class207.field2632 + field10606[0];
            }

            if (~class455.field6279 < -3) {
               var5 = var5 + field10606[4] + (class455.field6279 - 2) + class606.field8928.method4490(class782.field11389, -16777216);
            }

            if (class545.field7964 == null) {
               if (class570.field8386 != null && class688.field10127 == class450.field6103) {
                  int var12 = class98.field1306.method3422(class175.field2255, 118, 0, class58.field760 + 4, 16777215, class555.field8146, class476.field6643, class348.field4773 + 16, class406.field5572, var5);
                  class436.method3369(class348.field4773, -111, 16, class58.field760 + 4, var12 + class492.field6871.method139(46, var5));
                  return;
               }
            } else {
               class447 var13 = class545.field7964.method4725(arg1, (byte)59);
               if (var13 == null) {
                  var13 = class98.field1306;
               }

               var13.method3419(class175.field2255, class555.field8146, class545.field7964.field9572, class794.field11611, 3, class545.field7964.field9629, class545.field7964.field9625, class406.field5572, class476.field6643, class635.field9342, class545.field7964.field9534, class315.field4363, class545.field7964.field9574, class545.field7964.field9617, var5);
               class436.method3369(class315.field4363[1], -49, class315.field4363[3], class315.field4363[0], class315.field4363[2]);
            }

         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field10606[3] + arg0 + ',' + (arg1 != null ? field10606[1] : field10606[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "(IIBFIF[FFFII)V"
   )
   public abstract void method4845(int arg0, int arg1, byte arg2, float arg3, int arg4, float arg5, float[] arg6, float arg7, float arg8, int arg9, int arg10);

   @OriginalMember(
      owner = "client!eo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5256(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5257(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
