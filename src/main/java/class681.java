import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class681 {
   @OriginalMember(
      owner = "client!fj",
      name = "p",
      descriptor = "[I"
   )
   private int[] field9991;
   @OriginalMember(
      owner = "client!fj",
      name = "k",
      descriptor = "[I"
   )
   private int[] field9995;
   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10000 = new String[]{method4974(method4973("9p\t)\u0014")), method4974(method4973("9p\t,\u0014")), method4974(method4973("9p\t+\u0014")), method4974(method4973("9p\t(\u0014")), method4974(method4973("9p\t%\u0014")), method4974(method4973("1oK\u0001")), method4974(method4973("$4\tCA")), method4974(method4973("9p\tQU1sSS\u0014")), method4974(method4973("9p\t*\u0014")), method4974(method4973("9p\t/\u0014")), method4974(method4973("9p\t.\u0014"))};
   @OriginalMember(
      owner = "client!fj",
      name = "n",
      descriptor = "Lgh;"
   )
   public static class572 field9983 = new class572(95, 6);
   @OriginalMember(
      owner = "client!fj",
      name = "m",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field9993 = new String[]{method4974(method4973("\foI")), method4974(method4973("\u0012uI")), method4974(method4973("\u000boB")), method4974(method4973("\b\u007fC")), method4974(method4973("\u000brR")), method4974(method4973("\u0019hN")), method4974(method4973("\f{S"))};
   @OriginalMember(
      owner = "client!fj",
      name = "d",
      descriptor = "Lgh;"
   )
   public static class572 field9996 = new class572(110, 0);
   @OriginalMember(
      owner = "client!fj",
      name = "g",
      descriptor = "I"
   )
   public static int field9984;
   @OriginalMember(
      owner = "client!fj",
      name = "e",
      descriptor = "I"
   )
   public static int field9985;
   @OriginalMember(
      owner = "client!fj",
      name = "q",
      descriptor = "I"
   )
   public static int field9986;
   @OriginalMember(
      owner = "client!fj",
      name = "b",
      descriptor = "I"
   )
   public static int field9987;
   @OriginalMember(
      owner = "client!fj",
      name = "c",
      descriptor = "I"
   )
   private int field9988;
   @OriginalMember(
      owner = "client!fj",
      name = "h",
      descriptor = "I"
   )
   public static int field9989;
   @OriginalMember(
      owner = "client!fj",
      name = "l",
      descriptor = "I"
   )
   private int field9990;
   @OriginalMember(
      owner = "client!fj",
      name = "f",
      descriptor = "I"
   )
   public static int field9994;
   @OriginalMember(
      owner = "client!fj",
      name = "i",
      descriptor = "I"
   )
   public static int field9997;
   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "I"
   )
   private int field9998;
   @OriginalMember(
      owner = "client!fj",
      name = "o",
      descriptor = "I"
   )
   private int field9999;
   @OriginalMember(
      owner = "client!fj",
      name = "j",
      descriptor = "Lmi;"
   )
   public static class519 field9992;

   @OriginalMember(
      owner = "client!fj",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method4965(int arg0) {
      try {
         ++field9985;
         if (arg0 != 10970) {
            this.method4965(-55);
         }

         if (~this.field9990 == -1) {
            this.method4969(-122);
            this.field9990 = 256;
         }

         return this.field9991[--this.field9990];
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10000[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method4966(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var8 = arg3 << 3;
         int var6 = arg1 << 3;
         if (arg0 == -1) {
            ++field9987;
            int var7 = arg2 << 3;
            if (~class590.field8514 == -3) {
               class414.field6073 = var7;
               class127.field2133 = var6;
               class373.field5548 = var8;
            }

            class621.field9035 = (float)var7;
            class756.field10975 = (float)var8;
            class693.method5038((byte)14);
            class261.field3714 = true;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10000[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4967(int arg0) {
      try {
         ++field9984;
         class697.field10214 = true;
         if (arg0 != -1) {
            method4967(78);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10000[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4968(int arg0) {
      try {
         ++field9997;
         if (~this.field9990 == arg0) {
            this.method4969(-118);
            this.field9990 = 256;
         }

         return this.field9991[this.field9990 - 1];
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10000[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method4969(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field9994;
         this.field9988 += ++this.field9999;
         int var3 = 0;
         int var10000;
         if (var2) {
            var10000 = this.field9995[var3];
         } else if (var3 >= 256) {
            var10000 = arg0;
            if (!var2) {
               if (arg0 >= -27) {
                  this.method4971(-74);
                  return;
               }

               return;
            }
         } else {
            var10000 = this.field9995[var3];
         }

         while(true) {
            int var4;
            label65: {
               var4 = var10000;
               if (~(var3 & 2) == -1) {
                  if ((var3 & 1) == 0) {
                     this.field9998 ^= this.field9998 << 13;
                     if (!var2) {
                        break label65;
                     }
                  }

                  this.field9998 ^= this.field9998 >>> 6;
                  if (!var2) {
                     break label65;
                  }
               }

               if ((1 & var3) == 0) {
                  this.field9998 ^= this.field9998 << 2;
                  if (var2) {
                     this.field9998 ^= this.field9998 >>> 16;
                  }
               } else {
                  this.field9998 ^= this.field9998 >>> 16;
               }
            }

            this.field9998 += this.field9995[var3 + 128 & 255];
            int var5;
            this.field9995[var3] = var5 = this.field9988 + this.field9995[class66.method706(var4, 1020) >> 2] + this.field9998;
            this.field9991[var3] = this.field9988 = var4 + this.field9995[class66.method706(var5 >> 8 >> 2, 255)];
            ++var3;
            if (var3 >= 256) {
               var10000 = arg0;
               if (!var2) {
                  if (arg0 >= -27) {
                     this.method4971(-74);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this.field9995[var3];
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10000[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(IIIIZIIII)Z"
   )
   public static final boolean method4970(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field9989;
         int var9 = class304.field4398.field11313[0];
         int var10 = class304.field4398.field11322[0];
         if (var9 >= 0 && ~class209.field3112 < ~var9 && ~var10 <= -1 && class1.field3 > var10) {
            if (~arg5 <= -1 && class209.field3112 > arg5 && ~arg7 <= -1 && ~class1.field3 < ~arg7) {
               int var11 = class543.method4066(arg8, class498.field7285, 17341, var10, arg7, class763.field11056, arg4, class218.field3299[class304.field4398.field4090], arg3, arg0, arg5, var9, class304.field4398.method3438(false), arg2, arg6);
               if (~var11 > -2) {
                  return false;
               } else {
                  class770.field11213 = class763.field11056[var11 + -1];
                  class344.field4901 = class498.field7285[var11 - 1];
                  class626.field9115 = false;
                  class176.method1561(arg1 + arg1);
                  return true;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field10000[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "e",
      descriptor = "(I)V"
   )
   private final void method4971(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fj",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method4972(int arg0) {
      try {
         field9983 = null;
         field9996 = null;
         if (arg0 != 8796) {
            method4967(-8);
         }

         field9992 = null;
         field9993 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10000[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "<init>",
      descriptor = "()V"
   )
   private class681() {
   }

   @OriginalMember(
      owner = "client!fj",
      name = "<init>",
      descriptor = "([I)V"
   )
   public class681(int[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4973(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4974(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
