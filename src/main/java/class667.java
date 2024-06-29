import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class667 {
   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "Lsa;"
   )
   private class39 field9384;
   @OriginalMember(
      owner = "client!lfa",
      name = "g",
      descriptor = "Lsa;"
   )
   private class39 field9381;
   @OriginalMember(
      owner = "client!lfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9387 = new String[]{method4848(method4847("&h+\u0012%b")), method4848(method4847("1 d\u0012\u001c")), method4848(method4847("${&P")), method4848(method4847("&h+\u0012]#`#H_b")), method4848(method4847("&h+\u0012\"b")), method4848(method4847("&h+\u0012$b")), method4848(method4847("=|")), method4848(method4847("&h+\u0012#b"))};
   @OriginalMember(
      owner = "client!lfa",
      name = "c",
      descriptor = "Lfm;"
   )
   public static class164 field9380 = new class164(38, -1);
   @OriginalMember(
      owner = "client!lfa",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field9386 = new int[1];
   @OriginalMember(
      owner = "client!lfa",
      name = "d",
      descriptor = "I"
   )
   public static int field9379;
   @OriginalMember(
      owner = "client!lfa",
      name = "h",
      descriptor = "I"
   )
   public static int field9382;
   @OriginalMember(
      owner = "client!lfa",
      name = "b",
      descriptor = "I"
   )
   public static int field9383;
   @OriginalMember(
      owner = "client!lfa",
      name = "e",
      descriptor = "Llia;"
   )
   private class372 field9385;

   @OriginalMember(
      owner = "client!lfa",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4842(int arg0) {
      try {
         if (arg0 > -41) {
            field9386 = null;
         }

         field9380 = null;
         field9386 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9387[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "c",
      descriptor = "(I)Llia;"
   )
   private final class372 method4843(int arg0) {
      try {
         if (arg0 != 0) {
            method4845((class17)null, 4, -97, -107, -42, -57, -119, true, false);
         }

         if (this.field9385 == null) {
            this.field9385 = new class372();
         }

         ++field9383;
         return this.field9385;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9387[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(Lfja;I)Lwha;"
   )
   public final class534 method4844(class262 arg0, int arg1) {
      try {
         ++field9379;
         if (arg0 == null) {
            return null;
         } else {
            class577 var3 = arg0.method108((byte)-73);
            if (class555.field7889 == var3) {
               return new class510((class385)arg0);
            } else if (class25.field359 == var3) {
               return new class228(this.method4843(0), (class283)arg0);
            } else if (class220.field3142 == var3) {
               return new class739(this.field9384, (class377)arg0);
            } else if (class776.field11331 == var3) {
               return new class318(this.field9384, (class13)arg0);
            } else if (class556.field7899 == var3) {
               return new class94(this.field9384, this.field9381, (class705)arg0);
            } else if (class197.field2850 == var3) {
               return new class776(this.field9384, this.field9381, (class616)arg0);
            } else if (arg1 != -31432) {
               return null;
            } else if (class33.field484 == var3) {
               return new class428(this.field9384, this.field9381, (class53)arg0);
            } else if (class294.field4385 == var3) {
               return new class363(this.field9384, this.field9381, (class494)arg0);
            } else if (class196.field2831 == var3) {
               return new class322(this.field9384, (class265)arg0);
            } else {
               return class543.field7660 == var3 ? new class22(this.field9384, this.field9381, (class742)arg0) : null;
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9387[7] + (arg0 != null ? field9387[1] : field9387[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(Lha;IIIIIIZZ)V"
   )
   public static final void method4845(class17 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
      class720.field10315 = arg0;
      class734.field10434 = arg1;
      class684.field9885 = class734.field10434 > 1 && class720.field10315.method260();
      class313.field4707 = arg2;
      class44.field655 = 1 << class313.field4707;
      class744.field10587 = class44.field655 >> 1;
      Math.sqrt((double)(class744.field10587 * class744.field10587 + class744.field10587 * class744.field10587));
      class522.field7337 = arg3;
      class155.field2381 = arg4;
      class25.field360 = arg5;
      class15.field214 = arg6;
      class344.field5072 = class170.method1583(-121);
      class249.method2153(126);
      class211.field3016 = new class312[arg3][class155.field2381][class25.field360];
      class558.field7922 = new class751[arg3];
      if (arg7) {
         class157.field2392 = new int[class155.field2381][class25.field360];
         class6.field103 = new byte[class155.field2381][class25.field360];
         class175.field2603 = new short[class155.field2381][class25.field360];
         class506.field7196 = new class312[1][class155.field2381][class25.field360];
         class634.field8989 = new class751[1];
      } else {
         class157.field2392 = null;
         class6.field103 = null;
         class175.field2603 = null;
         class506.field7196 = null;
         class634.field8989 = null;
      }

      if (arg8) {
         class232.field3604 = new long[arg3][arg4][arg5];
         class274.field4176 = new class425[65535];
         class566.field8046 = new boolean[65535];
         class160.field2452 = 0;
      } else {
         class232.field3604 = null;
         class274.field4176 = null;
         class566.field8046 = null;
         class160.field2452 = 0;
      }

      class662.method4802(false);
      class615.field8739 = new class471[2];
      class705.field10147 = new class471[2];
      class399.field5912 = new class471[2];
      class487.field6946 = new class471[10000];
      class139.field2234 = 0;
      class582.field8184 = new class471[5000];
      class432.field6346 = 0;
      class788.field11486 = new class578[5000];
      class155.field2377 = 0;
      class232.field3602 = new boolean[class15.field214 + class15.field214 + 1][class15.field214 + class15.field214 + 1];
      class719.field10306 = new boolean[class15.field214 + class15.field214 + 2][class15.field214 + class15.field214 + 2];
      class84.field1302 = new int[class15.field214 + class15.field214 + 2];
      class416.field6098 = class416.field6085;
      if (class684.field9885) {
         class279.field4226 = new boolean[arg3][class15.field214 + class15.field214 + 1][class15.field214 + class15.field214 + 1];
         class627.field8951 = new boolean[arg3][][];
         if (class468.field6786 != null) {
            class346.method2748();
         }

         class468.field6786 = new class98[class734.field10434];
         class720.field10315.method155(class468.field6786.length + 1);
         class720.field10315.method174(0);

         for(int var9 = 0; var9 < class468.field6786.length; ++var9) {
            class468.field6786[var9] = new class98(var9 + 1, class720.field10315);
            (new Thread(class468.field6786[var9], field9387[6] + var9)).start();
         }

         byte var10;
         if (class734.field10434 == 2) {
            var10 = 4;
            class14.field198 = 2;
         } else if (class734.field10434 == 3) {
            var10 = 6;
            class14.field198 = 3;
         } else {
            var10 = 8;
            class14.field198 = 4;
         }

         class164.field2483 = new class697[var10];

         for(int var11 = 0; var11 < var10; ++var11) {
            class164.field2483[var11] = new class697(class610.field8691[class734.field10434 - 2][var11]);
         }
      } else {
         class14.field198 = 1;
      }

      class320.field4779 = new int[class14.field198 - 1];
      class364.field5373 = new int[class14.field198 - 1];
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "<init>",
      descriptor = "(Lsa;Lsa;)V"
   )
   public class667(class39 arg0, class39 arg1) {
      try {
         this.field9384 = arg0;
         this.field9381 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9387[3] + (arg0 != null ? field9387[1] : field9387[2]) + ',' + (arg1 != null ? field9387[1] : field9387[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4846(int arg0) {
      try {
         ++field9382;

         try {
            if (~class487.field6949 == -2) {
               int var1 = class691.field9950.method1166(arg0 ^ -80);
               if (~var1 < -1 && class691.field9950.method1177((byte)14)) {
                  int var2 = var1 - class10.field165;
                  if (~var2 > -1) {
                     var2 = 0;
                  }

                  class691.field9950.method1156(var2, true);
                  return;
               }

               label50: {
                  class691.field9950.method1172(47);
                  class691.field9950.method1178(false);
                  if (class563.field8019 == null) {
                     class487.field6949 = 0;
                     if (!client.field10022) {
                        break label50;
                     }
                  }

                  class487.field6949 = 2;
               }

               class79.field1252 = null;
               class350.field5134 = null;
            }

            if (arg0 != -1) {
               method4846(-15);
            }

            if (~class487.field6949 == -4) {
               int var3 = class691.field9950.method1166(90);
               if (~class438.field6424 < ~var3 && class691.field9950.method1177((byte)14)) {
                  int var4 = class94.field1537 + var3;
                  if (class438.field6424 < var4) {
                     var4 = class438.field6424;
                  }

                  class691.field9950.method1156(var4, true);
               } else {
                  class94.field1537 = 0;
                  class487.field6949 = 0;
               }
            }
         } catch (Exception var7) {
            var7.printStackTrace();
            class691.field9950.method1172(-112);
            class563.field8019 = null;
            class487.field6949 = 0;
            class79.field1252 = null;
            class350.field5134 = null;
            class778.field11344 = null;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field9387[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4847(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4848(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
