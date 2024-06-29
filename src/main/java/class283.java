import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class283 extends class316 {
   @OriginalMember(
      owner = "client!jl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3960 = new String[]{method2211(method2210("&tk\u000e\r")), method2211(method2210("&tk\u0005\r")), method2211(method2210("&tk\u000f\r")), method2211(method2210("&tk\t\r")), method2211(method2210("\"m) ")), method2211(method2210("76kbX")), method2211(method2210("&tk\b\r")), method2211(method2210("&tk\u000b\r")), method2211(method2210("&tk\n\r")), method2211(method2210("&tk\r\r"))};
   @OriginalMember(
      owner = "client!jl",
      name = "g",
      descriptor = "I"
   )
   public static int field3955 = 0;
   @OriginalMember(
      owner = "client!jl",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field3950 = new int[256];
   @OriginalMember(
      owner = "client!jl",
      name = "k",
      descriptor = "Lgw;"
   )
   public static class179 field3959;
   @OriginalMember(
      owner = "client!jl",
      name = "h",
      descriptor = "I"
   )
   public static int field3951;
   @OriginalMember(
      owner = "client!jl",
      name = "e",
      descriptor = "I"
   )
   public static int field3952;
   @OriginalMember(
      owner = "client!jl",
      name = "c",
      descriptor = "I"
   )
   public static int field3953;
   @OriginalMember(
      owner = "client!jl",
      name = "d",
      descriptor = "I"
   )
   public static int field3954;
   @OriginalMember(
      owner = "client!jl",
      name = "f",
      descriptor = "I"
   )
   public static int field3956;
   @OriginalMember(
      owner = "client!jl",
      name = "i",
      descriptor = "I"
   )
   public static int field3957;
   @OriginalMember(
      owner = "client!jl",
      name = "l",
      descriptor = "I"
   )
   public static int field3958;

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = var0;

         for(int var2 = 0; var2 < 8; ++var2) {
            if ((var1 & 1) != 1) {
               var1 >>>= 1;
            } else {
               var1 = -306674912 ^ var1 >>> 1;
            }
         }

         field3950[var0] = var1;
      }

      field3959 = new class179(10);
   }

   @OriginalMember(
      owner = "client!jl",
      name = "a",
      descriptor = "(III)V",
      line = 3
   )
   public final void method810(int arg0, int arg1, int arg2) {
      try {
         ++field3952;
         if (arg2 != 0) {
            field3959 = null;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3960[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "b",
      descriptor = "(BZ)V",
      line = 16
   )
   public final void method811(byte arg0, boolean arg1) {
      try {
         if (arg0 == 51) {
            ++field3954;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3960[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "a",
      descriptor = "(JZ)V",
      line = 29
   )
   public static final void method2208(long arg0, boolean arg1) {
      boolean var3 = client.field4564;

      try {
         if (!arg1) {
            ++field3951;
            int var4 = class745.field10737;
            if (~class587.field8484 != ~var4) {
               int var6;
               label80: {
                  int var5 = -class587.field8484 + var4;
                  var6 = (int)((long)var5 * arg0 / 320L);
                  if (var5 <= 0) {
                     if (~var6 != -1) {
                        if (~var5 >= ~var6) {
                           break label80;
                        }

                        var6 = var5;
                        if (!var3) {
                           break label80;
                        }
                     }

                     var6 = -1;
                     if (!var3) {
                        break label80;
                     }
                  }

                  if (~var6 == -1) {
                     var6 = 1;
                     if (!var3) {
                        break label80;
                     }
                  }

                  if (var5 < var6) {
                     var6 = var5;
                  }
               }

               class587.field8484 += var6;
            }

            int var7 = class66.field1224;
            class756.field10975 += (float)arg0 * class588.field8498 / 40.0F * 8.0F;
            if (~class243.field3500 != ~var7) {
               int var9;
               label81: {
                  int var8 = var7 - class243.field3500;
                  var9 = (int)((long)var8 * arg0 / 320L);
                  if (~var8 < -1) {
                     if (var9 != 0) {
                        if (var8 >= var9) {
                           break label81;
                        }

                        var9 = var8;
                        if (!var3) {
                           break label81;
                        }
                     }

                     var9 = 1;
                     if (!var3) {
                        break label81;
                     }
                  }

                  if (var9 != 0) {
                     if (var8 <= var9) {
                        break label81;
                     }

                     var9 = var8;
                     if (!var3) {
                        break label81;
                     }
                  }

                  var9 = -1;
               }

               class243.field3500 += var9;
            }

            class621.field9035 += (float)arg0 * class348.field4948 / 40.0F * 8.0F;
            class693.method5038((byte)14);
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field3960[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "<init>",
      descriptor = "(Lrk;)V",
      line = 110
   )
   public class283(class35 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jl",
      name = "a",
      descriptor = "(I)V",
      line = 114
   )
   public final void method805(int arg0) {
      try {
         super.field4567.method303(false, false);
         int var2 = -98 % ((-18 - arg0) / 63);
         ++field3953;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3960[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "b",
      descriptor = "(I)Z",
      line = 124
   )
   public final boolean method807(int arg0) {
      try {
         ++field3957;
         if (arg0 != -18913) {
            field3959 = null;
         }

         return true;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3960[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "a",
      descriptor = "(IILufa;)V",
      line = 136
   )
   public final void method804(int arg0, int arg1, class707 arg2) {
      try {
         super.field4567.method252(arg2, (byte)-120);
         if (arg0 == 0) {
            ++field3958;
            super.field4567.method322(-71, arg1);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3960[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3960[5] : field3960[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "a",
      descriptor = "(BZ)V",
      line = 149
   )
   public final void method806(byte arg0, boolean arg1) {
      try {
         int var3 = -3 / ((arg0 - -44) / 38);
         super.field4567.method303(true, false);
         ++field3956;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3960[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "a",
      descriptor = "(B)V",
      line = 163
   )
   public static void method2209(byte arg0) {
      try {
         field3959 = null;
         field3950 = null;
         if (arg0 <= 40) {
            field3950 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3960[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2210(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2211(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
