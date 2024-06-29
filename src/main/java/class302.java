import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public abstract class class302 extends class347 {
   @OriginalMember(
      owner = "client!oaa",
      name = "q",
      descriptor = "Z"
   )
   public boolean field4313;
   @OriginalMember(
      owner = "client!oaa",
      name = "x",
      descriptor = "[Loaa;"
   )
   public class302[] field4303;
   @OriginalMember(
      owner = "client!oaa",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4317 = new String[]{method2303(method2302(",\\:\u0014!k")), method2303(method2302("\u0017U2I@,M>H\u00017T4T@'R>I@-R/\u001a\b\"K>\u001a\u0001cP4T\u000f U)U\r&\u001d4O\u00143H/")), method2303(method2302("\u0017U2I@,M>H\u00017T4T@'R>I@-R/\u001a\b\"K>\u001a\u0001c^4V\u000f6O{U\u00157M.N")), method2303(method2302(",\\:\u0014\"k")), method2303(method2302(",\\:\u0014&k")), method2303(method2302("-H7V")), method2303(method2302("8\u0013u\u0014\u001d")), method2303(method2302(",\\:\u0014/k")), method2303(method2302(",\\:\u0014*k")), method2303(method2302(",\\:\u0014(k")), method2303(method2302(",\\:\u0014.k")), method2303(method2302(",\\:\u0014,k")), method2303(method2302(",\\:\u0014)k")), method2303(method2302(",\\:\u0014$k")), method2303(method2302(",\\:\u00140k")), method2303(method2302(",\\:\u0014+k")), method2303(method2302(",\\:\u0014-k")), method2303(method2302(",\\:\u0014\\*S2N^k"))};
   @OriginalMember(
      owner = "client!oaa",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field4301 = new int[16];
   @OriginalMember(
      owner = "client!oaa",
      name = "B",
      descriptor = "I"
   )
   public static int field4294 = -1;
   @OriginalMember(
      owner = "client!oaa",
      name = "A",
      descriptor = "Lsd;"
   )
   public static class101 field4306 = new class101(77, 3);
   @OriginalMember(
      owner = "client!oaa",
      name = "y",
      descriptor = "I"
   )
   public static int field4314 = 0;
   @OriginalMember(
      owner = "client!oaa",
      name = "s",
      descriptor = "[C"
   )
   public static char[] field4315 = new char[]{'[', ']', '#'};
   @OriginalMember(
      owner = "client!oaa",
      name = "u",
      descriptor = "I"
   )
   public static int field4293;
   @OriginalMember(
      owner = "client!oaa",
      name = "F",
      descriptor = "I"
   )
   public static int field4296;
   @OriginalMember(
      owner = "client!oaa",
      name = "o",
      descriptor = "I"
   )
   public static int field4297;
   @OriginalMember(
      owner = "client!oaa",
      name = "i",
      descriptor = "I"
   )
   public static int field4299;
   @OriginalMember(
      owner = "client!oaa",
      name = "t",
      descriptor = "I"
   )
   public static int field4300;
   @OriginalMember(
      owner = "client!oaa",
      name = "l",
      descriptor = "I"
   )
   public static int field4302;
   @OriginalMember(
      owner = "client!oaa",
      name = "C",
      descriptor = "I"
   )
   public static int field4304;
   @OriginalMember(
      owner = "client!oaa",
      name = "v",
      descriptor = "I"
   )
   public static int field4305;
   @OriginalMember(
      owner = "client!oaa",
      name = "j",
      descriptor = "I"
   )
   public static int field4307;
   @OriginalMember(
      owner = "client!oaa",
      name = "G",
      descriptor = "I"
   )
   public static int field4308;
   @OriginalMember(
      owner = "client!oaa",
      name = "p",
      descriptor = "I"
   )
   public static int field4309;
   @OriginalMember(
      owner = "client!oaa",
      name = "r",
      descriptor = "I"
   )
   public static int field4310;
   @OriginalMember(
      owner = "client!oaa",
      name = "n",
      descriptor = "I"
   )
   public int field4312;
   @OriginalMember(
      owner = "client!oaa",
      name = "m",
      descriptor = "I"
   )
   public static int field4316;
   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "Lhf;"
   )
   public class415 field4298;
   @OriginalMember(
      owner = "client!oaa",
      name = "E",
      descriptor = "Luba;"
   )
   public class453 field4292;
   @OriginalMember(
      owner = "client!oaa",
      name = "D",
      descriptor = "Lti;"
   )
   public static class464 field4295;
   @OriginalMember(
      owner = "client!oaa",
      name = "k",
      descriptor = "[Ltba;"
   )
   public static class172[] field4311;

   @OriginalMember(
      owner = "client!oaa",
      name = "b",
      descriptor = "(III)[[I"
   )
   public final int[][] method2297(int arg0, int arg1, int arg2) {
      try {
         ++field4304;
         if (arg2 != 0) {
            return null;
         } else if (this.field4303[arg0].field4313) {
            int[] var4 = this.field4303[arg0].method401(arg1, -95);
            return new int[][]{var4, var4, var4};
         } else {
            return this.field4303[arg0].method245((byte)-90, arg1);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field4317[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public void method242(int arg0, int arg1, boolean arg2) {
      try {
         ++field4299;
         if (!arg2) {
            method2298(62);
         }

         int var4 = this.field4312 != 255 ? this.field4312 : arg1;
         if (!this.field4313) {
            this.field4292 = new class453(var4, arg1, arg0);
         } else {
            this.field4298 = new class415(var4, arg1, arg0);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4317[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2298(int arg0) {
      try {
         field4306 = null;
         field4311 = null;
         field4315 = null;
         field4301 = null;
         field4295 = null;
         if (arg0 != -1) {
            method2301(-121, (Canvas)null);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4317[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(IZI)[I"
   )
   public final int[] method2299(int arg0, boolean arg1, int arg2) {
      try {
         ++field4310;
         if (arg1) {
            this.method2297(114, -32, 121);
         }

         return this.field4303[arg2].field4313 ? this.field4303[arg2].method401(arg0, -47) : this.field4303[arg2].method245((byte)-90, arg0)[0];
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4317[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method2300(byte arg0) {
      int var1 = client.field4530;

      try {
         ++field4309;
         class522 var2 = (class522)class224.field2867.method4071((byte)126);
         if (var2 == null) {
            return false;
         } else {
            if (arg0 < 25) {
               method2300((byte)-8);
            }

            int var3 = 0;
            if (var1 != 0) {
               if (var2.field7586[var3] != null && var2.field7586[var3].field159 == 0) {
                  return false;
               }

               if (var2.field7590[var3] != null) {
                  if (var2.field7590[var3].field159 == 0) {
                     return false;
                  }

                  ++var3;
               } else {
                  ++var3;
               }
            }

            while(true) {
               while(~var2.field7583 < ~var3) {
                  if (var2.field7586[var3] != null && var2.field7586[var3].field159 == 0) {
                     return false;
                  }

                  if (var2.field7590[var3] != null) {
                     if (var2.field7590[var3].field159 == 0) {
                        return false;
                     }

                     ++var3;
                  } else {
                     ++var3;
                  }
               }

               if (var1 == 0) {
                  return true;
               }

               if (false) {
                  return false;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4317[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(II)[I"
   )
   public int[] method401(int arg0, int arg1) {
      try {
         if (arg1 >= -37) {
            this.method2297(20, 107, 67);
         }

         ++field4297;
         throw new IllegalStateException(field4317[1]);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4317[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(Z)V"
   )
   public void method241(boolean arg0) {
      try {
         if (!arg0) {
            label19: {
               if (this.field4313) {
                  this.field4298.method3171(64);
                  this.field4298 = null;
                  if (client.field4530 == 0) {
                     break label19;
                  }
               }

               this.field4292.method3407((byte)54);
               this.field4292 = null;
            }

            ++field4308;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4317[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "e",
      descriptor = "(I)I"
   )
   public int method243(int arg0) {
      try {
         ++field4296;
         return arg0 != -1 ? -87 : -1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4317[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;)V"
   )
   public static final void method2301(int arg0, Canvas arg1) {
      try {
         label23: {
            ++field4293;
            Dimension var2 = arg1.getSize();
            class785.method5640(var2.height, 71, var2.width);
            if (~class4.field85 == -2) {
               class616.field9011.method584(arg1, class680.field10222, class379.field5808);
               if (client.field4530 == 0) {
                  break label23;
               }
            }

            class616.field9011.method584(arg1, class92.field1176, class73.field933);
         }

         int var3 = -98 % ((-6 - arg0) / 40);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4317[11] + arg0 + ',' + (arg1 != null ? field4317[6] : field4317[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public void method244(int arg0, int arg1, class128 arg2) {
      try {
         ++field4307;
         if (arg1 != 0) {
            this.field4303 = null;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4317[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4317[6] : field4317[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "b",
      descriptor = "(B)V"
   )
   public void method708(byte arg0) {
      try {
         if (arg0 >= -87) {
            field4316 = -114;
         }

         ++field4300;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4317[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(I)I"
   )
   public int method1224(int arg0) {
      try {
         if (arg0 != -1) {
            this.method245((byte)-121, 85);
         }

         ++field4302;
         return -1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4317[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(BI)[[I"
   )
   public int[][] method245(byte arg0, int arg1) {
      try {
         ++field4305;
         if (arg0 != -90) {
            this.field4313 = true;
         }

         throw new IllegalStateException(field4317[2]);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4317[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "<init>",
      descriptor = "(IZ)V"
   )
   public class302(int arg0, boolean arg1) {
      try {
         this.field4313 = arg1;
         this.field4303 = new class302[arg0];
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4317[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2302(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2303(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
