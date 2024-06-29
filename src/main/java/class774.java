import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class774 {
   @OriginalMember(
      owner = "client!sp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11277 = new String[]{method5590(method5589("HL}\u0019DhH!\u0004E\\\u0014")), method5590(method5589("UI?\u0001")), method5590(method5589("@\u0012}CV")), method5590(method5589("HL},\u0003")), method5590(method5589("HL}.\u0003")), method5590(method5589("HL})\u0003")), method5590(method5589("HL}/\u0003"))};
   @OriginalMember(
      owner = "client!sp",
      name = "d",
      descriptor = "I"
   )
   public static int field11272 = 0;
   @OriginalMember(
      owner = "client!sp",
      name = "b",
      descriptor = "I"
   )
   public static int field11271;
   @OriginalMember(
      owner = "client!sp",
      name = "e",
      descriptor = "I"
   )
   public static int field11273;
   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "I"
   )
   public static int field11275;
   @OriginalMember(
      owner = "client!sp",
      name = "f",
      descriptor = "I"
   )
   public static int field11276;
   @OriginalMember(
      owner = "client!sp",
      name = "c",
      descriptor = "Lww;"
   )
   public static class339 field11274;

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5585(int arg0) {
      try {
         if (arg0 == 99999999) {
            field11274 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11277[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field11276;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11277[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(Lnl;Lmn;II)V"
   )
   public static final void method5586(class713 arg0, class238 arg1, int arg2, int arg3) {
      try {
         ++field11271;
         if (~class128.field1640 > -51) {
            if (arg1 != null && arg1.field3032 != null && arg1.field3032.length > arg3 && arg1.field3032[arg3] != null) {
               int var4 = arg1.field3032[arg3][0];
               int var5 = var4 >> 8;
               int var6 = (248 & var4) >> 5;
               int var7 = 31 & var4;
               if (~arg1.field3032[arg3].length < -2) {
                  int var8 = (int)(Math.random() * (double)arg1.field3032[arg3].length);
                  if (~var8 < -1) {
                     var5 = arg1.field3032[arg3][var8];
                  }
               }

               if (arg2 != 1673748489) {
                  field11272 = -83;
               }

               int var9 = 256;
               if (arg1.field3028 != null && arg1.field3017 != null) {
                  var9 = arg1.field3028[arg3] + (int)((double)(arg1.field3017[arg3] + -arg1.field3028[arg3]) * Math.random());
               }

               int var10 = arg1.field3006 == null ? 255 : arg1.field3006[arg3];
               if (~var7 == -1) {
                  if (class204.field2593 == arg0) {
                     if (!arg1.field3005) {
                        class43.method322(var10, var5, 0, arg2 + -1673748489, var6, var9);
                        return;
                     }

                     class679.method4953(var6, false, var10, var9, (byte)23, 0, var5);
                  }

               } else if (class757.field11093.field11006.method3351(-18033) != 0) {
                  int var11 = arg0.field10467 + -256 >> 9;
                  int var12 = arg0.field10468 - 256 >> 9;
                  int var13 = class204.field2593 != arg0 ? (var12 << 8) + (arg0.field10457 << 24) + (var11 << 16) - -var7 : 0;
                  client.field1479[class128.field1640++] = new class142((byte)(!arg1.field3005 ? 1 : 2), var5, var6, 0, var10, var13, var9, arg0);
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field11277[4] + (arg0 != null ? field11277[2] : field11277[1]) + ',' + (arg1 != null ? field11277[2] : field11277[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(ILfv;)[I"
   )
   public static final int[] method5587(int arg0, class702 arg1) {
      boolean var2 = client.field1481;

      try {
         ++field11273;
         if (arg0 != -11) {
            method5586((class713)null, (class238)null, -1, -66);
         }

         class66 var3 = new class66(518);
         int[] var4 = new int[4];
         int var5 = 0;
         if (var2) {
            var4[var5] = (int)(9.9999999E7D * Math.random());
            ++var5;
         }

         while(true) {
            while(~var5 > -5) {
               var4[var5] = (int)(9.9999999E7D * Math.random());
               ++var5;
            }

            var3.method593(10, 867770704);
            var3.method649((byte)-124, var4[0]);
            var3.method649((byte)-124, var4[1]);
            var3.method649((byte)-124, var4[2]);
            var3.method649((byte)-124, var4[3]);
            int var6 = 0;
            if (!var2) {
               if (var2) {
                  var3.method649((byte)-124, (int)(Math.random() * 9.9999999E7D));
                  ++var6;
               }

               while(true) {
                  while(~var6 > -11) {
                     var3.method649((byte)-124, (int)(Math.random() * 9.9999999E7D));
                     ++var6;
                  }

                  var3.method611((int)(Math.random() * 9.9999999E7D), -1344798296);
                  var3.method605(class783.field11414, class458.field6305, 115);
                  arg1.field10264.method601(113, var3.field864, 0, var3.field859);
                  if (!var2) {
                     return var4;
                  }

                  ++var6;
               }
            }

            ++var5;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field11277[3] + arg0 + ',' + (arg1 != null ? field11277[2] : field11277[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method5588(int arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         if (arg0 == -2104) {
            label45: {
               class491.field6864 = -1;
               if (~arg1 != -38) {
                  if (arg1 != 50) {
                     if (~arg1 != -76) {
                        if (arg1 != 100) {
                           if (arg1 != 200) {
                              break label45;
                           }

                           class326.field4483 = 16.0F;
                           if (!var2) {
                              break label45;
                           }
                        }

                        class326.field4483 = 8.0F;
                        if (!var2) {
                           break label45;
                        }
                     }

                     class326.field4483 = 6.0F;
                     if (!var2) {
                        break label45;
                     }
                  }

                  class326.field4483 = 4.0F;
                  if (!var2) {
                     break label45;
                  }
               }

               class326.field4483 = 3.0F;
            }

            ++field11275;
            class491.field6864 = -1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11277[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5589(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5590(char[] arg0) {
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
            var10005 = 60;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
