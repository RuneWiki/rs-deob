import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public abstract class class389 extends class428 {
   @OriginalMember(
      owner = "client!mn",
      name = "n",
      descriptor = "I"
   )
   public int field5639;
   @OriginalMember(
      owner = "client!mn",
      name = "A",
      descriptor = "F"
   )
   public float field5649;
   @OriginalMember(
      owner = "client!mn",
      name = "y",
      descriptor = "I"
   )
   public int field5645;
   @OriginalMember(
      owner = "client!mn",
      name = "p",
      descriptor = "I"
   )
   private int field5648;
   @OriginalMember(
      owner = "client!mn",
      name = "q",
      descriptor = "I"
   )
   public int field5638;
   @OriginalMember(
      owner = "client!mn",
      name = "u",
      descriptor = "I"
   )
   private int field5636;
   @OriginalMember(
      owner = "client!mn",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5652 = new String[]{method2965(method2964("\r<RS")), method2965(method2964("\u0018g\u0010\u0011J")), method2965(method2964("\u000e'\u0010w\u001f")), method2965(method2964("\u000e'\u0010u\u001f")), method2965(method2964("\u000e'\u0010r\u001f")), method2965(method2964("\u000e'\u0010t\u001f")), method2965(method2964("\u000e'\u0010o\u001f")), method2965(method2964("\u000e'\u0010n\u001f")), method2965(method2964("\u000e'\u0010s\u001f")), method2965(method2964("\u000e'\u0010q\u001f")), method2965(method2964("\u000e'\u0010x\u001f")), method2965(method2964("\u000e'\u0010v\u001f")), method2965(method2964("\u000e'\u0010p\u001f")), method2965(method2964("\u000e'\u0010\u0003^\r J\u0001\u001f"))};
   @OriginalMember(
      owner = "client!mn",
      name = "B",
      descriptor = "I"
   )
   public static int field5635;
   @OriginalMember(
      owner = "client!mn",
      name = "C",
      descriptor = "I"
   )
   public static int field5637;
   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "I"
   )
   public static int field5640;
   @OriginalMember(
      owner = "client!mn",
      name = "w",
      descriptor = "I"
   )
   public static int field5641;
   @OriginalMember(
      owner = "client!mn",
      name = "s",
      descriptor = "I"
   )
   public static int field5642;
   @OriginalMember(
      owner = "client!mn",
      name = "v",
      descriptor = "I"
   )
   public static int field5643;
   @OriginalMember(
      owner = "client!mn",
      name = "t",
      descriptor = "I"
   )
   public static int field5644;
   @OriginalMember(
      owner = "client!mn",
      name = "r",
      descriptor = "I"
   )
   public static int field5646;
   @OriginalMember(
      owner = "client!mn",
      name = "m",
      descriptor = "I"
   )
   public static int field5647;
   @OriginalMember(
      owner = "client!mn",
      name = "o",
      descriptor = "I"
   )
   public static int field5650;
   @OriginalMember(
      owner = "client!mn",
      name = "x",
      descriptor = "I"
   )
   public static int field5651;

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(ILjava/lang/String;)I",
      line = 13
   )
   public static final int method2953(int arg0, String arg1) {
      boolean var2 = client.field4360;

      try {
         ++field5651;
         if (arg0 <= 41) {
            return 105;
         } else if (!class144.field1828.field9134) {
            return -1;
         } else if (class641.field9377.containsKey(arg1)) {
            return 100;
         } else {
            String var3 = class244.method1860(arg1, (byte)95);
            if (var3 == null) {
               return -1;
            } else {
               String var4 = class106.field1333 + var3;
               if (!class317.field4323.method2035((byte)-106, var4, "")) {
                  return -1;
               } else if (!class317.field4323.method2033(false, var4)) {
                  return class317.field4323.method2042((byte)-63, var4);
               } else {
                  byte[] var5 = class317.field4323.method2032("", (byte)-72, var4);
                  Object var6 = null;

                  File var7;
                  try {
                     var7 = class219.method1726(var3, 0);
                  } catch (RuntimeException var12) {
                     return -1;
                  }

                  if (var5 != null && var7 != null) {
                     boolean var8;
                     label110: {
                        var8 = true;
                        byte[] var9 = class119.method953(var7, false);
                        if (var9 == null || ~var5.length != ~var9.length) {
                           var8 = false;
                           if (!var2) {
                              break label110;
                           }
                        }

                        int var10 = 0;
                        if (var2 || ~var9.length < ~var10) {
                           do {
                              if (var5[var10] != var9[var10]) {
                                 var8 = false;
                                 if (!var2) {
                                    break;
                                 }
                              }

                              ++var10;
                           } while(~var9.length < ~var10);
                        }
                     }

                     try {
                        if (!var8) {
                           class144.field1828.method4511(true, var5, var7);
                        }
                     } catch (Throwable var13) {
                        return -1;
                     }

                     class565.method4028(0, arg1, var7);
                     return 100;
                  } else {
                     return -1;
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field5652[8] + arg0 + ',' + (arg1 != null ? field5652[1] : field5652[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(ZB)V",
      line = 107
   )
   public static final void method2954(boolean arg0, byte arg1) {
      try {
         label35: {
            ++field5640;
            if (arg0 && class650.field9486 != null) {
               class168.field2350 = class650.field9486.field11148;
               if (!client.field4360) {
                  break label35;
               }
            }

            class168.field2350 = -1;
         }

         class116.field1452 = 0;
         class521.field7495 = null;
         class792.field11613 = null;
         class650.field9486 = null;
         class650.method4750();
         class650.field9493.method2934(0);
         class144.field1839 = null;
         class278.field3783 = null;
         class12.field132 = null;
         class25.field373 = null;
         class478.field6866 = -1;
         class792.field11612 = null;
         class286.field3961 = null;
         class74.field908 = -1;
         class650.field9499 = null;
         class744.field10853 = null;
         class136.field1734 = null;
         class271.field3744 = null;
         if (class650.field9488 != null) {
            class650.field9488.method5667((byte)-125);
            class650.field9488.method5668(12938, 128, 64);
         }

         if (arg1 <= -86) {
            if (class650.field9490 != null) {
               class650.field9490.method4592(64, 64, 100);
            }

            if (class650.field9487 != null) {
               class650.field9487.method3982(22, 64);
            }

            class631.field9253.method4277(64, (byte)-34);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5652[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "c",
      descriptor = "(Z)I",
      line = 154
   )
   public final int method2955(boolean arg0) {
      try {
         ++field5650;
         if (arg0) {
            method2953(-99, (String)null);
         }

         return this.field5639;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5652[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "c",
      descriptor = "(I)Lhn;",
      line = 168
   )
   public static final class753 method2956(int arg0) {
      try {
         ++field5641;
         return arg0 != 31140 ? null : class650.field9486;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5652[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(Lij;IIBI)V",
      line = 181
   )
   public static final void method2957(class447 arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         ++field5642;
         arg0.field6359.method1160(106, arg1);
         if (arg3 == 85) {
            arg0.field6359.method1190(arg3 + -9805, arg2);
            arg0.field6359.method1190(-9720, arg4);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5652[2] + (arg0 != null ? field5652[1] : field5652[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(B)I",
      line = 197
   )
   public final int method2958(byte arg0) {
      try {
         int var2 = -89 % ((44 - arg0) / 56);
         ++field5635;
         return this.field5648;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5652[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(I)I",
      line = 208
   )
   public final int method2959(int arg0) {
      try {
         ++field5643;
         int var2 = -24 % ((arg0 - -71) / 55);
         return this.field5638;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5652[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(I[Lbl;IZBI)V",
      line = 223
   )
   public static final void method2960(int arg0, class678[] arg1, int arg2, boolean arg3, byte arg4, int arg5) {
      boolean var6 = client.field4360;

      try {
         ++field5646;
         int var7 = 0;
         int var8 = 86 % ((arg4 - 2) / 34);
         if (var6 || ~var7 > ~arg1.length) {
            do {
               class678 var9 = arg1[var7];
               if (var9 != null && ~var9.field9892 == ~arg5) {
                  class611.method4443(arg3, var9, arg2, true, arg0);
                  class773.method5586(arg0, var9, arg2, 0);
                  if (var9.field9978 - var9.field9904 < var9.field9864) {
                     var9.field9864 = -var9.field9904 + var9.field9978;
                  }

                  if (var9.field9991 > var9.field9972 - var9.field9980) {
                     var9.field9991 = -var9.field9980 + var9.field9972;
                  }

                  if (var9.field9864 < 0) {
                     var9.field9864 = 0;
                  }

                  if (var9.field9991 < 0) {
                     var9.field9991 = 0;
                  }

                  if (var9.field9992 == 0) {
                     class132.method1045(arg3, var9, 49);
                  }
               }

               ++var7;
            } while(~var7 > ~arg1.length);

         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field5652[12] + arg0 + ',' + (arg1 != null ? field5652[1] : field5652[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "b",
      descriptor = "(I)I",
      line = 269
   )
   public final int method2961(int arg0) {
      try {
         if (arg0 <= 108) {
            this.method2962(40);
         }

         ++field5644;
         return this.field5636;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5652[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "<init>",
      descriptor = "(IIIIIF)V",
      line = 280
   )
   public class389(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         this.field5639 = arg0;
         this.field5649 = arg5;
         this.field5645 = arg2;
         this.field5648 = arg3;
         this.field5638 = arg1;
         this.field5636 = arg4;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5652[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "d",
      descriptor = "(I)F",
      line = 295
   )
   public final float method2962(int arg0) {
      try {
         if (arg0 != -1) {
            this.field5648 = 43;
         }

         ++field5637;
         return this.field5649;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5652[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(Z)I",
      line = 306
   )
   public final int method2963(boolean arg0) {
      try {
         if (!arg0) {
            return -65;
         } else {
            ++field5647;
            return this.field5645;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5652[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(IF)V"
   )
   public abstract void method777(int arg0, float arg1);

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(IBII)V"
   )
   public abstract void method778(int arg0, byte arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2964(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2965(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
