import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class149 extends class550 {
   @OriginalMember(
      owner = "client!ts",
      name = "x",
      descriptor = "F"
   )
   private float field2267 = 0.0F;
   @OriginalMember(
      owner = "client!ts",
      name = "m",
      descriptor = "Lsc;"
   )
   private class97 field2263;
   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2269 = new String[]{method1371(method1370("@(n\u001e'@&d*")), method1371(method1370("G(`2lA(x4l\u007f<x'+@,")), method1371(method1370("Y:8\u0000j")), method1371(method1370("C<z?")), method1371(method1370("Vg8}?")), method1371(method1370("Y:8o+C bmj")), method1371(method1370("Y:8\u0014j")), method1371(method1370("Y:8\u001fj")), method1371(method1370("Y:8\u0001j")), method1371(method1370("Y:8\u0016j")), method1371(method1370("Y:8\u001dj")), method1371(method1370("Y:8\u0012j")), method1371(method1370("Y:8\u001aj")), method1371(method1370("Y:8\u0010j")), method1371(method1370("Y:8\u0011j")), method1371(method1370("Y:8\u001cj")), method1371(method1370("Y:8\u0015j"))};
   @OriginalMember(
      owner = "client!ts",
      name = "v",
      descriptor = "Ljava/lang/String;"
   )
   public static String field2256 = null;
   @OriginalMember(
      owner = "client!ts",
      name = "s",
      descriptor = "I"
   )
   public static int field2253;
   @OriginalMember(
      owner = "client!ts",
      name = "r",
      descriptor = "I"
   )
   public static int field2255;
   @OriginalMember(
      owner = "client!ts",
      name = "t",
      descriptor = "I"
   )
   public static int field2257;
   @OriginalMember(
      owner = "client!ts",
      name = "k",
      descriptor = "I"
   )
   public static int field2258;
   @OriginalMember(
      owner = "client!ts",
      name = "j",
      descriptor = "I"
   )
   public static int field2259;
   @OriginalMember(
      owner = "client!ts",
      name = "u",
      descriptor = "I"
   )
   public static int field2260;
   @OriginalMember(
      owner = "client!ts",
      name = "y",
      descriptor = "I"
   )
   public static int field2261;
   @OriginalMember(
      owner = "client!ts",
      name = "o",
      descriptor = "I"
   )
   public static int field2262;
   @OriginalMember(
      owner = "client!ts",
      name = "p",
      descriptor = "I"
   )
   public static int field2264;
   @OriginalMember(
      owner = "client!ts",
      name = "w",
      descriptor = "I"
   )
   public static int field2265;
   @OriginalMember(
      owner = "client!ts",
      name = "n",
      descriptor = "I"
   )
   public static int field2266;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!ts",
      name = "q",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field2268;
   @OriginalMember(
      owner = "client!ts",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field2254;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method1369(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(ZB)V",
      line = 4
   )
   public final void method73(boolean arg0, byte arg1) {
      try {
         super.field8234.method2220(1, 14);
         ++field2257;
         super.field8234.method2212((byte)119, class154.field2302, class453.field6943);
         super.field8234.method1494(0, true, 0, class751.field11122, false);
         super.field8234.method2221(0, (byte)51, class36.field435);
         if (arg1 <= -44) {
            super.field8234.method1458((byte)-119, 0);
            super.field8234.method2220(0, 14);
            super.field8234.method2218(-16777216, 22121);
            super.field8234.method2221(0, (byte)51, class700.field10441);
            this.method70(-2);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2269[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "d",
      descriptor = "(I)V",
      line = 25
   )
   public final void method70(int arg0) {
      try {
         ++field2261;
         if (super.field8234.method2241(-127) == 0) {
            class504 var2 = super.field8234.method2180((byte)33);
            super.field8234.method2220(1, 14);
            class504 var3 = super.field8234.method2188(0);
            var3.method1549(var2);
            var3.method3902(0.125F, true, 1.0F, 0.125F);
            var3.method3918(this.field2267, 0.0F, 0.0F, true);
            super.field8234.method2247(11901, class443.field6802);
            super.field8234.method2220(0, arg0 + 16);
         }

         if (arg0 != -2) {
            field2254 = null;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field2269[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "g",
      descriptor = "(I)V",
      line = 50
   )
   public static final void method1364(int arg0) {
      try {
         ++field2253;
         int var1 = -46 % ((50 - arg0) / 34);
         if (class498.field7578.field4542) {
            class480.field7293 = 96;
         } else {
            try {
               Method var2 = (field2268 != null ? field2268 : (field2268 = method1369(field2269[1]))).getMethod(field2269[0]);
               if (var2 != null) {
                  try {
                     Runtime var3 = Runtime.getRuntime();
                     Long var4 = (Long)var2.invoke(var3, (Object[])null);
                     class480.field7293 = 1 + (int)(var4 / 1048576L);
                  } catch (Throwable var6) {
                  }
               }
            } catch (Exception var7) {
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2269[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "e",
      descriptor = "(B)V",
      line = 84
   )
   public static void method1365(byte arg0) {
      try {
         if (arg0 <= -83) {
            field2254 = null;
            field2256 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2269[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(IBLwm;)V",
      line = 95
   )
   public final void method71(int arg0, byte arg1, class428 arg2) {
      try {
         int var4 = -8 % ((arg1 - 18) / 60);
         ++field2266;
         super.field8234.method2193(arg2, (byte)-19);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2269[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2269[4] : field2269[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(ZZ)Z",
      line = 106
   )
   public static boolean method1366(boolean arg0, boolean arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2269[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(IILfq;)I",
      line = 114
   )
   public static final int method1367(int arg0, int arg1, class374 arg2) {
      try {
         ++field2265;
         if (!client.method1148(arg2).method526(arg1, (byte)-61) && arg2.field5914 == null) {
            return -1;
         } else {
            if (arg0 != 4000) {
               field2262 = 87;
            }

            return arg2.field5811 != null && ~arg1 > ~arg2.field5811.length ? arg2.field5811[arg1] : -1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2269[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2269[4] : field2269[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "c",
      descriptor = "(B)Z",
      line = 129
   )
   public final boolean method69(byte arg0) {
      try {
         ++field2264;
         if (arg0 != 120) {
            field2256 = null;
         }

         return this.field2263.method955((byte)-113);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2269[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "b",
      descriptor = "(I)V",
      line = 140
   )
   public final void method72(int arg0) {
      try {
         super.field8234.method2220(1, 14);
         ++field2258;
         super.field8234.method2212((byte)119, class716.field10733, class716.field10733);
         super.field8234.method2185((byte)-98, 0, class751.field11122);
         if (arg0 != -2) {
            this.method69((byte)126);
         }

         super.field8234.method2221(0, (byte)51, class751.field11122);
         super.field8234.method1458((byte)-117, 1);
         super.field8234.method2193((class428)null, (byte)-19);
         super.field8234.method2220(0, arg0 + 16);
         super.field8234.method2221(0, (byte)51, class751.field11122);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2269[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "<init>",
      descriptor = "(Lmu;Lsc;)V",
      line = 158
   )
   public class149(class258 arg0, class97 arg1) {
      super(arg0);

      try {
         this.field2263 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2269[5] + (arg0 != null ? field2269[4] : field2269[3]) + ',' + (arg1 != null ? field2269[4] : field2269[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(BII)V",
      line = 166
   )
   public final void method67(byte arg0, int arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         if (arg0 == 90) {
            label40: {
               super.field8234.method2220(1, 14);
               ++field2260;
               if ((arg2 & 128) == 0) {
                  if ((arg1 & 1) != 1) {
                     if (!this.field2263.field1361) {
                        super.field8234.method2193(this.field2263.field1363[0], (byte)-19);
                        if (!var4) {
                           break label40;
                        }
                     }

                     super.field8234.method2193(this.field2263.field1367, (byte)-19);
                     if (!var4) {
                        break label40;
                     }
                  }

                  if (!this.field2263.field1361) {
                     int var5 = super.field8234.field4155 % 4000 * 16 / 4000;
                     super.field8234.method2193(this.field2263.field1363[var5], (byte)-19);
                     if (!var4) {
                        break label40;
                     }
                  }

                  this.field2267 = (float)(super.field8234.field4155 % 4000) / 4000.0F;
                  super.field8234.method2193(this.field2263.field1367, (byte)-19);
                  if (!var4) {
                     break label40;
                  }
               }

               super.field8234.method2193((class428)null, (byte)-19);
            }

            super.field8234.method2220(0, 14);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2269[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(BZ)V",
      line = 212
   )
   public final void method78(byte arg0, boolean arg1) {
      try {
         if (arg0 < 82) {
            field2262 = 80;
         }

         ++field2259;
         super.field8234.method2212((byte)119, class716.field10733, class453.field6943);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2269[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "([[S[[FB)[[S",
      line = 231
   )
   public static final short[][] method1368(short[][] arg0, float[][] arg1, byte arg2) {
      boolean var3 = client.field1786;

      try {
         ++field2255;
         int var4 = 0;
         if (arg2 < 17) {
            method1367(-99, 57, (class374)null);
            if (!var3 && arg1.length <= var4) {
               return arg0;
            }
         } else if (arg1.length <= var4) {
            return arg0;
         }

         do {
            int var5 = 0;
            if (var3) {
               arg0[var4][var5] = (short)((int)(arg1[var4][var5] * 16383.0F));
               ++var5;
            }

            while(true) {
               while(~var5 > ~arg0[var4].length) {
                  arg0[var4][var5] = (short)((int)(arg1[var4][var5] * 16383.0F));
                  ++var5;
               }

               if (!var3) {
                  ++var4;
                  break;
               }

               ++var5;
            }
         } while(arg1.length > var4);

         return arg0;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2269[7] + (arg0 != null ? field2269[4] : field2269[3]) + ',' + (arg1 != null ? field2269[4] : field2269[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1370(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1371(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
