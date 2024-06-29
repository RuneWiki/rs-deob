import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public abstract class class533 {
   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7518 = new String[]{method3990(method3989("r4f\u000b")), method3990(method3989("go$Iv")), method3990(method3989("i1$-#")), method3990(method3989("i1$/#")), method3990(method3989("i1$.#")), method3990(method3989("i1$ #")), method3990(method3989("<l*")), method3990(method3989("Hs*J+"))};
   @OriginalMember(
      owner = "client!up",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field7515 = new int[500];
   @OriginalMember(
      owner = "client!up",
      name = "e",
      descriptor = "I"
   )
   public static int field7513;
   @OriginalMember(
      owner = "client!up",
      name = "b",
      descriptor = "I"
   )
   public static int field7514;
   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "I"
   )
   public static int field7516;
   @OriginalMember(
      owner = "client!up",
      name = "f",
      descriptor = "I"
   )
   public static int field7517;
   @OriginalMember(
      owner = "client!up",
      name = "c",
      descriptor = "[[[S"
   )
   public static short[][][] field7512;

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(Ljava/lang/String;IZB)V"
   )
   public static final void method3985(String arg0, int arg1, boolean arg2, byte arg3) {
      try {
         ++field7513;
         class639.method4657(107);
         if (~arg1 == -1) {
            class54.field794 = class243.method2121(-89, 0, class729.field10389, 2 * class476.field6870.field9146.method4480(-114), class199.field2876, class318.field4761);
            if (arg0 != null) {
               class54.field794.method184(0);
               class440 var13 = class578.method4272(0, class622.field8893, -22579, class1.field5);
               class216 var14 = class54.field794.method170(var13, class433.method3384(class790.field11506, class622.field8893, 0), true);
               class646.method4702(true);
               class644.method4685(var13, arg0, (byte)-74, true, var14, class54.field794);
            }
         } else {
            class17 var4 = null;
            if (arg0 != null) {
               var4 = class243.method2121(-94, 0, class729.field10389, 0, class199.field2876, class318.field4761);
               var4.method184(0);
               class440 var5 = class578.method4272(0, class622.field8893, -22579, class1.field5);
               class216 var6 = var4.method170(var5, class433.method3384(class790.field11506, class622.field8893, 0), true);
               class646.method4702(true);
               class644.method4685(var5, arg0, (byte)-39, true, var6, var4);
            }

            boolean var27 = false;

            label251: {
               try {
                  var27 = true;
                  class54.field794 = class243.method2121(-84, arg1, class729.field10389, class476.field6870.field9146.method4480(-128) * 2, class199.field2876, class318.field4761);
                  if (arg0 != null) {
                     var4.method184(0);
                     class440 var7 = class578.method4272(0, class622.field8893, -22579, class1.field5);
                     class216 var8 = var4.method170(var7, class433.method3384(class790.field11506, class622.field8893, 0), true);
                     class646.method4702(true);
                     class644.method4685(var7, arg0, (byte)-61, true, var8, var4);
                  }

                  if (class54.field794.method243()) {
                     boolean var9 = true;

                     try {
                        var9 = class223.field3173.field6015 > 256;
                     } catch (Throwable var31) {
                     }

                     class348 var10;
                     label231: {
                        if (!var9) {
                           var10 = class54.field794.method167(104857600);
                           if (!client.field10022) {
                              break label231;
                           }
                        }

                        var10 = class54.field794.method167(146800640);
                     }

                     class54.field794.method189(var10);
                     var27 = false;
                  } else {
                     var27 = false;
                  }
                  break label251;
               } catch (Throwable var32) {
                  int var11 = class476.field6870.field9109.method4676(-114);
                  if (var11 == 2) {
                     class39.field594 = true;
                  }

                  class476.field6870.method4707(0, false, class476.field6870.field9109);
                  method3985(arg0, var11, arg2, (byte)-123);
                  Object var10000 = null;
                  var27 = false;
               } finally {
                  if (var27) {
                     Object var19 = null;
                     if (var4 != null) {
                        try {
                           var4.method181(true);
                        } catch (Throwable var28) {
                        }
                     }

                  }
               }

               if (var4 != null) {
                  try {
                     var4.method181(true);
                  } catch (Throwable var29) {
                  }
               }

               return;
            }

            Object var18 = null;
            if (var4 != null) {
               try {
                  var4.method181(true);
               } catch (Throwable var30) {
               }
            }
         }

         class476.field6870.field9109.method4680(!arg2, 3);
         class476.field6870.method4707(arg1, false, class476.field6870.field9109);
         class117.method1140((byte)125);
         class54.field794.method263(10000);
         class54.field794.method160(32);
         class178.field2626 = class54.field794.method183();
         int var15 = 69 / ((arg3 - -66) / 33);
         class686.field9905 = class54.field794.method183();
         class484.method3691((byte)101);
         class54.field794.method164(class476.field6870.field9113.method4697(-99) == 1);
         if (class54.field794.method168()) {
            class209.method1807(~class476.field6870.field9142.method93(-126) == -2, false);
         }

         class391.method3034(class54.field794, class209.field2989 >> 3, (byte)-88, class234.field3626 >> 3);
         class215.method1854((byte)-128);
         class664.field9354 = false;
         class350.field5131 = true;
         class589.field8296 = null;
         class745.method5366(true);
      } catch (RuntimeException var34) {
         throw class612.method4503(var34, field7518[2] + (arg0 != null ? field7518[1] : field7518[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(ILdr;)Z"
   )
   public static final boolean method3986(int arg0, class242 arg1) {
      boolean var2 = client.field10022;

      try {
         ++field7514;

         try {
            if (arg0 != -14032) {
               field7517 = -65;
            }

            return class508.method3826(arg1, (byte)-105);
         } catch (IOException var7) {
            if (class394.field5712 == 9) {
               arg1.field3713 = null;
               return false;
            } else {
               class570.method4224(14);
               return true;
            }
         } catch (Exception var8) {
            int var10000;
            boolean var10001;
            label72: {
               String var4;
               label71: {
                  var4 = field7518[7] + (arg1.field3724 == null ? -1 : arg1.field3724.method5240((byte)-91)) + "," + (arg1.field3722 == null ? -1 : arg1.field3722.method5240((byte)-41)) + "," + (arg1.field3728 == null ? -1 : arg1.field3728.method5240((byte)-46)) + field7518[6] + arg1.field3721 + "," + (class117.field1849.field5861[0] + class115.field1824) + "," + (class117.field1849.field5865[0] + class480.field6903) + field7518[6];
                  int var5 = 0;
                  if (!var2) {
                     if (~arg1.field3721 >= ~var5) {
                        break label71;
                     }

                     var10000 = ~var5;
                     var10001 = true;
                     if (var2) {
                        break label72;
                     }

                     if (var10000 <= -51) {
                        break label71;
                     }
                  }

                  do {
                     var4 = var4 + arg1.field3719.field942[var5] + ",";
                     ++var5;
                     if (~arg1.field3721 >= ~var5) {
                        break;
                     }

                     var10000 = ~var5;
                     var10001 = true;
                     if (var2) {
                        break label72;
                     }
                  } while(var10000 > -51);
               }

               class117.method1138(-118, var4, var8);
               var10000 = 21995;
               var10001 = false;
            }

            class593.method4358(var10000, var10001);
            return true;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field7518[5] + arg0 + ',' + (arg1 != null ? field7518[1] : field7518[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method2554(boolean arg0);

   @OriginalMember(
      owner = "client!up",
      name = "b",
      descriptor = "(III[B)V"
   )
   public abstract void method2553(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(II)Z"
   )
   public abstract boolean method2549(int arg0, int arg1) throws IOException;

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3987(int arg0) {
      try {
         field7515 = null;
         if (arg0 != 0) {
            field7515 = null;
         }

         field7512 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7518[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method2550(int arg0);

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(III[B)I"
   )
   public abstract int method2551(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3988(int arg0, int arg1, int arg2) {
      try {
         if (arg1 < 34) {
            return true;
         } else {
            ++field7516;
            return (arg0 & 384) != 0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7518[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3989(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3990(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
