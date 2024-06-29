import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class303 extends class70 {
   @OriginalMember(
      owner = "client!jfa",
      name = "G",
      descriptor = "J"
   )
   public long field4330;
   @OriginalMember(
      owner = "client!jfa",
      name = "H",
      descriptor = "Ljava/lang/String;"
   )
   public String field4323;
   @OriginalMember(
      owner = "client!jfa",
      name = "I",
      descriptor = "I"
   )
   public int field4333;
   @OriginalMember(
      owner = "client!jfa",
      name = "E",
      descriptor = "Ljava/lang/String;"
   )
   public String field4318;
   @OriginalMember(
      owner = "client!jfa",
      name = "A",
      descriptor = "I"
   )
   public int field4331;
   @OriginalMember(
      owner = "client!jfa",
      name = "y",
      descriptor = "Z"
   )
   public boolean field4329;
   @OriginalMember(
      owner = "client!jfa",
      name = "F",
      descriptor = "I"
   )
   public int field4328;
   @OriginalMember(
      owner = "client!jfa",
      name = "M",
      descriptor = "I"
   )
   public int field4332;
   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "J"
   )
   public long field4324;
   @OriginalMember(
      owner = "client!jfa",
      name = "C",
      descriptor = "Z"
   )
   public boolean field4322;
   @OriginalMember(
      owner = "client!jfa",
      name = "J",
      descriptor = "I"
   )
   public int field4321;
   @OriginalMember(
      owner = "client!jfa",
      name = "x",
      descriptor = "Z"
   )
   public boolean field4319;
   @OriginalMember(
      owner = "client!jfa",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4335 = new String[]{method2307(method2306("<\nn!V?\u0002f{T~")), method2307(method2306("8\u0019cc")), method2307(method2306("-B!!\u0017")), method2307(method2306("<\nn! ~")), method2307(method2306("<\nn!#~"))};
   @OriginalMember(
      owner = "client!jfa",
      name = "D",
      descriptor = "I"
   )
   public static int field4325 = -1;
   @OriginalMember(
      owner = "client!jfa",
      name = "B",
      descriptor = "I"
   )
   public static int field4327 = 0;
   @OriginalMember(
      owner = "client!jfa",
      name = "K",
      descriptor = "I"
   )
   public static int field4334;
   @OriginalMember(
      owner = "client!jfa",
      name = "L",
      descriptor = "Leaa;"
   )
   public static class526 field4326;
   @OriginalMember(
      owner = "client!jfa",
      name = "N",
      descriptor = "Ljava/lang/String;"
   )
   public String field4320;

   @OriginalMember(
      owner = "client!jfa",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method2304(int arg0) {
      try {
         field4326 = null;
         if (arg0 != -2001) {
            method2304(-98);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4335[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(JI)V"
   )
   public static final void method2305(long arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field4334;
         int var4 = class442.field6742 + class693.field10418.field9003;
         int var5 = class123.field1495 + class693.field10418.field9007;
         if (~(-var4 + class573.field8527) > 1999 || -var4 + class573.field8527 > 2000 || ~(-var5 + class747.field11068) > 1999 || ~(-var5 + class747.field11068) < -2001) {
            class573.field8527 = var4;
            class747.field11068 = var5;
         }

         if (~class573.field8527 != ~var4) {
            int var7;
            label96: {
               int var6 = -class573.field8527 + var4;
               var7 = (int)((long)var6 * arg0 / 320L);
               if (var6 <= 0) {
                  if (var7 == 0) {
                     var7 = -1;
                     if (var3 == 0) {
                        break label96;
                     }
                  }

                  if (~var6 >= ~var7) {
                     break label96;
                  }

                  var7 = var6;
                  if (var3 == 0) {
                     break label96;
                  }
               }

               if (~var7 != -1) {
                  if (~var7 >= ~var6) {
                     break label96;
                  }

                  var7 = var6;
                  if (var3 == 0) {
                     break label96;
                  }
               }

               var7 = 1;
            }

            class573.field8527 += var7;
         }

         if (arg1 != 6331) {
            method2305(58L, 12);
         }

         class56.field706 += (float)arg0 * class280.field3895 / 6.0F;
         class317.field4533 += (float)arg0 * class186.field2333 / 6.0F;
         if (~class747.field11068 != ~var5) {
            int var9;
            label98: {
               int var8 = -class747.field11068 + var5;
               var9 = (int)((long)var8 * arg0 / 320L);
               if (var8 > 0) {
                  if (~var9 != -1) {
                     if (~var9 >= ~var8) {
                        break label98;
                     }

                     var9 = var8;
                     if (var3 == 0) {
                        break label98;
                     }
                  }

                  var9 = 1;
                  if (var3 == 0) {
                     break label98;
                  }
               }

               if (var9 != 0) {
                  if (var8 <= var9) {
                     break label98;
                  }

                  var9 = var8;
                  if (var3 == 0) {
                     break label98;
                  }
               }

               var9 = -1;
            }

            class747.field11068 += var9;
         }

         class383.method2947(arg1 + 25001);
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field4335[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V"
   )
   public class303(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
      try {
         this.field4330 = arg10;
         this.field4323 = arg0;
         this.field4333 = arg3;
         this.field4318 = arg1;
         this.field4331 = arg2;
         this.field4329 = arg8;
         this.field4328 = arg7;
         this.field4332 = arg4;
         this.field4324 = arg5;
         this.field4322 = arg11;
         this.field4321 = arg6;
         this.field4319 = arg9;
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field4335[0] + (arg0 != null ? field4335[2] : field4335[1]) + ',' + (arg1 != null ? field4335[2] : field4335[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2306(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2307(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
