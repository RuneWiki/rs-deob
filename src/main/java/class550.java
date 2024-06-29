import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class550 {
   @OriginalMember(
      owner = "client!um",
      name = "k",
      descriptor = "Lwb;"
   )
   public class347 field8129 = new class347();
   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8146 = new String[]{method4074(method4073("V1p#\u0001")), method4074(method4073("V1p'\u0001")), method4074(method4073("V1p/\u0001")), method4074(method4073("Xrp@T")), method4074(method4073("M)2\u0002")), method4074(method4073("V1p \u0001")), method4074(method4073("V1p$\u0001")), method4074(method4073("V1p,\u0001")), method4074(method4073("V1p+\u0001")), method4074(method4073("V1p%\u0001")), method4074(method4073("V1p(\u0001")), method4074(method4073("V1p)\u0001")), method4074(method4073("V1p&\u0001")), method4074(method4073("V1p-\u0001")), method4074(method4073("V1p\"\u0001")), method4074(method4073("V1p*\u0001")), method4074(method4073("V1pR@M5*P\u0001"))};
   @OriginalMember(
      owner = "client!um",
      name = "f",
      descriptor = "I"
   )
   public static int field8131;
   @OriginalMember(
      owner = "client!um",
      name = "l",
      descriptor = "I"
   )
   public static int field8132;
   @OriginalMember(
      owner = "client!um",
      name = "p",
      descriptor = "I"
   )
   public static int field8133;
   @OriginalMember(
      owner = "client!um",
      name = "h",
      descriptor = "I"
   )
   public static int field8134;
   @OriginalMember(
      owner = "client!um",
      name = "o",
      descriptor = "I"
   )
   public static int field8135;
   @OriginalMember(
      owner = "client!um",
      name = "g",
      descriptor = "I"
   )
   public static int field8136;
   @OriginalMember(
      owner = "client!um",
      name = "e",
      descriptor = "I"
   )
   public static int field8137;
   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "I"
   )
   public static int field8138;
   @OriginalMember(
      owner = "client!um",
      name = "c",
      descriptor = "I"
   )
   public static int field8140;
   @OriginalMember(
      owner = "client!um",
      name = "m",
      descriptor = "I"
   )
   public static int field8142;
   @OriginalMember(
      owner = "client!um",
      name = "b",
      descriptor = "I"
   )
   public static int field8143;
   @OriginalMember(
      owner = "client!um",
      name = "j",
      descriptor = "I"
   )
   public static int field8144;
   @OriginalMember(
      owner = "client!um",
      name = "i",
      descriptor = "I"
   )
   public static int field8145;
   @OriginalMember(
      owner = "client!um",
      name = "d",
      descriptor = "Lwh;"
   )
   public static class157 field8139;
   @OriginalMember(
      owner = "client!um",
      name = "n",
      descriptor = "Lkg;"
   )
   public static class284 field8130;
   @OriginalMember(
      owner = "client!um",
      name = "q",
      descriptor = "Lwb;"
   )
   private class347 field8141;

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(B)Lwb;",
      line = 5
   )
   public final class347 method4059(byte arg0) {
      try {
         ++field8142;
         class347 var2 = this.field8141;
         if (this.field8129 == var2) {
            this.field8141 = null;
            return null;
         } else {
            this.field8141 = var2.field5278;
            int var3 = 93 % ((61 - arg0) / 45);
            return var2;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8146[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(ILwb;)V",
      line = 29
   )
   public final void method4060(int arg0, class347 arg1) {
      try {
         ++field8145;
         if (arg1.field5277 != null) {
            arg1.method2720(arg0 + -23);
         }

         arg1.field5278 = this.field8129;
         arg1.field5277 = this.field8129.field5277;
         arg1.field5277.field5278 = arg1;
         if (arg0 != 23) {
            field8139 = null;
         }

         arg1.field5278.field5277 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8146[14] + arg0 + ',' + (arg1 != null ? field8146[3] : field8146[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "c",
      descriptor = "(Z)Lwb;",
      line = 46
   )
   public final class347 method4061(boolean arg0) {
      try {
         ++field8133;
         class347 var2 = this.field8129.field5277;
         if (this.field8129 == var2) {
            this.field8141 = null;
            return null;
         } else if (arg0) {
            return null;
         } else {
            this.field8141 = var2.field5277;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8146[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "d",
      descriptor = "(I)V",
      line = 71
   )
   public final void method4062(int arg0) {
      int var2 = client.field4530;

      try {
         while(true) {
            class347 var3 = this.field8129.field5278;
            if (this.field8129 != var3) {
               var3.method2720(0);
               if (var2 != 0) {
                  break;
               }

               if (var2 == 0) {
                  continue;
               }
            }

            if (arg0 != 0) {
               return;
            }

            ++field8144;
            this.field8141 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8146[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "b",
      descriptor = "(I)Lwb;",
      line = 93
   )
   public final class347 method4063(int arg0) {
      try {
         ++field8137;
         if (arg0 != -5) {
            this.method4062(77);
         }

         class347 var2 = this.field8129.field5278;
         if (this.field8129 == var2) {
            return null;
         } else {
            var2.method2720(0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8146[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "c",
      descriptor = "(I)Lwb;",
      line = 111
   )
   public final class347 method4064(int arg0) {
      try {
         if (arg0 <= 10) {
            this.method4059((byte)35);
         }

         ++field8140;
         class347 var2 = this.field8141;
         if (this.field8129 == var2) {
            this.field8141 = null;
            return null;
         } else {
            this.field8141 = var2.field5277;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8146[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(II)Z",
      line = 132
   )
   public static final boolean method4065(int arg0, int arg1) {
      try {
         if (arg1 < 112) {
            return false;
         } else {
            ++field8132;
            if (~arg0 != -5 && arg0 != 23 && ~arg0 != -51 && ~arg0 != -53 && ~arg0 != -17) {
               return ~arg0 == -11 || ~arg0 == -1008;
            } else {
               return true;
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8146[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(Lum;Lwb;I)V",
      line = 150
   )
   private final void method4066(class550 arg0, class347 arg1, int arg2) {
      try {
         ++field8136;
         class347 var4 = this.field8129.field5277;
         this.field8129.field5277 = arg1.field5277;
         arg1.field5277.field5278 = this.field8129;
         if (arg2 != -20748) {
            this.method4072(false);
         }

         if (this.field8129 != arg1) {
            arg1.field5277 = arg0.field8129.field5277;
            arg1.field5277.field5278 = arg1;
            arg0.field8129.field5277 = var4;
            var4.field5278 = arg0.field8129;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8146[5] + (arg0 != null ? field8146[3] : field8146[4]) + ',' + (arg1 != null ? field8146[3] : field8146[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(I)V",
      line = 175
   )
   public static void method4067(int arg0) {
      try {
         if (arg0 != -16080) {
            field8139 = null;
         }

         field8139 = null;
         field8130 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8146[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(Z)Z",
      line = 186
   )
   public final boolean method4068(boolean arg0) {
      try {
         ++field8134;
         if (arg0) {
            this.method4070((class347)null, (byte)92);
         }

         return this.field8129.field5278 == this.field8129;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8146[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(Lum;I)V",
      line = 199
   )
   public final void method4069(class550 arg0, int arg1) {
      try {
         this.method4066(arg0, this.field8129.field5278, arg1 + -34860);
         if (arg1 != 14112) {
            this.method4061(true);
         }

         ++field8143;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8146[8] + (arg0 != null ? field8146[3] : field8146[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(Lwb;B)V",
      line = 212
   )
   public final void method4070(class347 arg0, byte arg1) {
      try {
         if (arg1 != 50) {
            this.method4069((class550)null, 28);
         }

         if (arg0.field5277 != null) {
            arg0.method2720(0);
         }

         ++field8131;
         arg0.field5277 = this.field8129;
         arg0.field5278 = this.field8129.field5278;
         arg0.field5277.field5278 = arg0;
         arg0.field5278.field5277 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8146[6] + (arg0 != null ? field8146[3] : field8146[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "<init>",
      descriptor = "()V",
      line = 267
   )
   public class550() {
      try {
         this.field8129.field5278 = this.field8129;
         this.field8129.field5277 = this.field8129;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8146[16] + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "b",
      descriptor = "(B)Lwb;",
      line = 233
   )
   public final class347 method4071(byte arg0) {
      try {
         ++field8135;
         class347 var2 = this.field8129.field5278;
         if (arg0 < 125) {
            this.method4071((byte)55);
         }

         if (this.field8129 == var2) {
            this.field8141 = null;
            return null;
         } else {
            this.field8141 = var2.field5278;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8146[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "b",
      descriptor = "(Z)I",
      line = 277
   )
   public final int method4072(boolean arg0) {
      int var2 = client.field4530;

      try {
         ++field8138;
         if (arg0) {
            field8139 = null;
         }

         int var3 = 0;
         class347 var4 = this.field8129.field5278;
         if (var2 != 0) {
            var4 = var4.field5278;
            ++var3;
         }

         while(true) {
            while(this.field8129 != var4) {
               var4 = var4.field5278;
               ++var3;
            }

            if (var2 == 0) {
               return var3;
            }

            ++var3;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8146[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4073(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4074(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
