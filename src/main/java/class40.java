import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public abstract class class40 implements class272 {
   @OriginalMember(
      owner = "client!vt",
      name = "k",
      descriptor = "Lrr;"
   )
   private class678 field486;
   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "Lrr;"
   )
   public class678 field487;
   @OriginalMember(
      owner = "client!vt",
      name = "i",
      descriptor = "Lve;"
   )
   public class603 field485;
   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field493 = new String[]{method288(method287("f{\u0014\u001d&~fN\u001fg")), method288(method287("k!\u0014\u000f2")), method288(method287("~zVM")), method288(method287("f{\u0014mg")), method288(method287("f{\u0014hg")), method288(method287("f{\u0014jg")), method288(method287("f{\u0014eg")), method288(method287("f{\u0014bg")), method288(method287("0'")), method288(method287("f{\u0014kg")), method288(method287("f{\u0014dg"))};
   @OriginalMember(
      owner = "client!vt",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field491 = false;
   @OriginalMember(
      owner = "client!vt",
      name = "j",
      descriptor = "Leh;"
   )
   public static class19 field484 = new class19(1);
   @OriginalMember(
      owner = "client!vt",
      name = "n",
      descriptor = "I"
   )
   public static int field479;
   @OriginalMember(
      owner = "client!vt",
      name = "e",
      descriptor = "I"
   )
   private int field480;
   @OriginalMember(
      owner = "client!vt",
      name = "c",
      descriptor = "I"
   )
   public static int field482;
   @OriginalMember(
      owner = "client!vt",
      name = "b",
      descriptor = "I"
   )
   public static int field483;
   @OriginalMember(
      owner = "client!vt",
      name = "h",
      descriptor = "I"
   )
   public static int field488;
   @OriginalMember(
      owner = "client!vt",
      name = "m",
      descriptor = "I"
   )
   public static int field489;
   @OriginalMember(
      owner = "client!vt",
      name = "d",
      descriptor = "I"
   )
   public static int field490;
   @OriginalMember(
      owner = "client!vt",
      name = "g",
      descriptor = "J"
   )
   private long field492;
   @OriginalMember(
      owner = "client!vt",
      name = "l",
      descriptor = "Lda;"
   )
   private class288 field481;

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(Z)V",
      line = 7
   )
   public static void method280(boolean arg0) {
      try {
         if (!arg0) {
            field484 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field493[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(FFIF)I",
      line = 17
   )
   public static final int method281(float arg0, float arg1, int arg2, float arg3) {
      try {
         ++field490;
         float var4 = !(arg1 < 0.0F) ? arg1 : -arg1;
         float var5 = arg3 < 0.0F ? -arg3 : arg3;
         if (arg2 != 5) {
            field491 = true;
         }

         float var6 = !(arg0 < 0.0F) ? arg0 : -arg0;
         if (var4 < var5 && var6 < var5) {
            return arg3 > 0.0F ? 0 : 1;
         } else if (var6 > var4 && var5 < var6) {
            return !(arg0 > 0.0F) ? 3 : 2;
         } else {
            return !(arg1 > 0.0F) ? 5 : 4;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field493[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "b",
      descriptor = "(B)V",
      line = 61
   )
   public void method282(byte arg0) {
      try {
         ++field489;
         class697 var2 = class227.method1961((byte)32, this.field485.field8822, this.field486);
         this.field481 = class351.field5356.method598(var2, class776.method5643(this.field487, this.field485.field8822), true);
         if (arg0 <= 98) {
            this.field487 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field493[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(Lha;I)V",
      line = 77
   )
   public static final void method283(class610 arg0, int arg1) {
      try {
         class722.field10805 = class300.method2513(arg0, (byte)110, class633.field9161, true);
         ++field488;
         if (arg1 <= 108) {
            field484 = null;
         }

         class632.field9131 = class645.method4691(class633.field9161, (byte)24, arg0);
         class577.field8538 = class300.method2513(arg0, (byte)94, class20.field255, true);
         class564.field8381 = class645.method4691(class20.field255, (byte)24, arg0);
         class156.field2324 = class300.method2513(arg0, (byte)94, class553.field8274, true);
         class355.field5457 = class645.method4691(class553.field8274, (byte)24, arg0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field493[9] + (arg0 != null ? field493[1] : field493[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(ZZ)V",
      line = 95
   )
   public final void method284(boolean arg0, boolean arg1) {
      try {
         ++field483;
         int var3 = this.field485.field8810.method5105(121, class154.field2293, this.field485.field8820) - -this.field485.field8819;
         int var4 = this.field485.field8815.method5508(108, class445.field6835, this.field485.field8811) - -this.field485.field8823;
         if (arg0) {
            method281(-0.8502089F, 0.088688865F, -116, 0.6043165F);
         }

         this.method278(-24843, var3, var4, arg1);
         this.method279(arg1, var4, var3, (byte)-128);
         String var5 = class443.field6804.method1344((byte)125);
         if (class162.method1442(14080) - this.field492 > 10000L) {
            var5 = var5 + field493[8] + class443.field6804.method1340((byte)109).method5686((byte)-81) + ")";
         }

         this.field481.method2405(this.field485.field8811 / 2 + var4 + 4 - -this.field485.field8818, var5, -1, this.field485.field8820 / 2 + var3, this.field485.field8814, (byte)-23);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field493[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(B)Z",
      line = 119
   )
   public boolean method285(byte arg0) {
      try {
         if (arg0 != 8) {
            field484 = null;
         }

         ++field479;
         boolean var2 = true;
         if (!this.field487.method5002(this.field485.field8822, (byte)122)) {
            var2 = false;
         }

         if (!this.field486.method5002(this.field485.field8822, (byte)97)) {
            var2 = false;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field493[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "<init>",
      descriptor = "(Lrr;Lrr;Lve;)V",
      line = 144
   )
   public class40(class678 arg0, class678 arg1, class603 arg2) {
      try {
         this.field486 = arg1;
         this.field487 = arg0;
         this.field485 = arg2;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field493[0] + (arg0 != null ? field493[1] : field493[2]) + ',' + (arg1 != null ? field493[1] : field493[2]) + ',' + (arg2 != null ? field493[1] : field493[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "c",
      descriptor = "(B)I",
      line = 154
   )
   public final int method286(byte arg0) {
      boolean var2 = client.field1786;

      try {
         ++field482;
         int var3 = class443.field6804.method1346(20);
         int var4 = var3 * 100;
         if (arg0 > -77) {
            return 34;
         } else {
            if (~this.field480 != ~var3 || var3 == 0) {
               this.field480 = var3;
               this.field492 = class162.method1442(14080);
               if (!var2) {
                  return var4;
               }
            }

            int var5 = class443.field6804.method1343(-1);
            if (~var3 > ~var5) {
               long var6 = this.field492 + -class443.field6804.method1338(62);
               if (var6 > 0L) {
                  long var8 = var6 * 10000L / (long)var3 * (long)(-var3 + var5);
                  long var10 = (class162.method1442(14080) + -this.field492) * 10000L;
                  if (var10 < var8) {
                     var4 = (int)((long)(-var3 + var5) * 100L * var10 / var8 + (long)(var3 * 100));
                     if (!var2) {
                        return var4;
                     }
                  }

                  var4 = var5 * 100;
               }
            }

            return var4;
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field493[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(IIIZ)V"
   )
   public abstract void method278(int arg0, int arg1, int arg2, boolean arg3);

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(ZIIB)V"
   )
   public abstract void method279(boolean arg0, int arg1, int arg2, byte arg3);

   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method287(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method288(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
