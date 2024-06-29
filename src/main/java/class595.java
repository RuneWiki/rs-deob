import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class595 {
   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8299 = new String[]{method4349(method4348("1mJ&")), method4349(method4348("wn7.")), method4349(method4348("1mM&")), method4349(method4348("1mH&")), method4349(method4348("!m' U")), method4349(method4348("1mK&")), method4349(method4348("46eb")), method4349(method4348("*'h"))};
   @OriginalMember(
      owner = "client!k",
      name = "l",
      descriptor = "Z"
   )
   public static volatile boolean field8294 = true;
   @OriginalMember(
      owner = "client!k",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field8291 = false;
   @OriginalMember(
      owner = "client!k",
      name = "b",
      descriptor = "I"
   )
   public static int field8298 = 0;
   @OriginalMember(
      owner = "client!k",
      name = "i",
      descriptor = "I"
   )
   public static int field8286;
   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "I"
   )
   public int field8287;
   @OriginalMember(
      owner = "client!k",
      name = "k",
      descriptor = "I"
   )
   public static int field8288;
   @OriginalMember(
      owner = "client!k",
      name = "g",
      descriptor = "I"
   )
   public static int field8289;
   @OriginalMember(
      owner = "client!k",
      name = "d",
      descriptor = "I"
   )
   public int field8290;
   @OriginalMember(
      owner = "client!k",
      name = "j",
      descriptor = "I"
   )
   public static int field8292;
   @OriginalMember(
      owner = "client!k",
      name = "m",
      descriptor = "I"
   )
   public int field8293;
   @OriginalMember(
      owner = "client!k",
      name = "e",
      descriptor = "I"
   )
   public static int field8295;
   @OriginalMember(
      owner = "client!k",
      name = "f",
      descriptor = "I"
   )
   public static int field8296;
   @OriginalMember(
      owner = "client!k",
      name = "c",
      descriptor = "I"
   )
   public static int field8297;

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4344(int arg0) {
      boolean var1 = client.field4273;

      try {
         label42: {
            if (class246.field3094 <= 0) {
               class203.field2495 = "";
               if (!var1) {
                  break label42;
               }
            }

            int var2 = 0;
            int var3 = 0;
            if (var1 || ~var3 > ~class440.field6113.length) {
               do {
                  if (class440.field6113[var3].indexOf(field8299[1]) != -1) {
                     ++var2;
                     if (class246.field3094 == var2) {
                        class203.field2495 = class440.field6113[var3].substring(class440.field6113[var3].indexOf(">") + 2);
                        if (!var1) {
                           break;
                        }
                     }
                  }

                  ++var3;
               } while(~var3 > ~class440.field6113.length);
            }
         }

         ++field8296;
         int var4 = -64 % ((-24 - arg0) / 53);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8299[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(Z)Z"
   )
   public static final boolean method4345(boolean arg0) {
      try {
         if (arg0) {
            return true;
         } else {
            ++field8289;
            return ~class449.field6210 != -1 ? true : class131.field1647.method675((byte)38);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8299[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4346(int arg0) {
      try {
         label127: {
            ++field8292;
            int var1 = class27.field338 * 512 + 256;
            int var2 = class772.field11146 * 512 - -256;
            int var3 = class687.method5016(var1, class239.field2981, var2, 2) - class13.field162;
            if (class291.field3842 < 100) {
               if (var1 > class737.field10747) {
                  class737.field10747 += class508.field7042 - -((-class737.field10747 + var1) * class291.field3842 / 1000);
                  if (class737.field10747 > var1) {
                     class737.field10747 = var1;
                  }
               }

               if (~var3 < ~class331.field4733) {
                  class331.field4733 += (-class331.field4733 + var3) * class291.field3842 / 1000 + class508.field7042;
                  if (~class331.field4733 < ~var3) {
                     class331.field4733 = var3;
                  }
               }

               if (var1 < class737.field10747) {
                  class737.field10747 -= class508.field7042 - -((class737.field10747 - var1) * class291.field3842 / 1000);
                  if (var1 > class737.field10747) {
                     class737.field10747 = var1;
                  }
               }

               if (~class331.field4733 < ~var3) {
                  class331.field4733 -= (-var3 + class331.field4733) * class291.field3842 / 1000 + class508.field7042;
                  if (var3 > class331.field4733) {
                     class331.field4733 = var3;
                  }
               }

               if (class532.field7284 < var2) {
                  class532.field7284 += class508.field7042 - -((-class532.field7284 + var2) * class291.field3842 / 1000);
                  if (~var2 > ~class532.field7284) {
                     class532.field7284 = var2;
                  }
               }

               if (~var2 <= ~class532.field7284) {
                  break label127;
               }

               class532.field7284 -= (class532.field7284 - var2) * class291.field3842 / 1000 + class508.field7042;
               if (~var2 >= ~class532.field7284) {
                  break label127;
               }

               class532.field7284 = var2;
               if (!client.field4273) {
                  break label127;
               }
            }

            class532.field7284 = class772.field11146 * 512 + 256;
            class737.field10747 = class27.field338 * 512 + 256;
            class331.field4733 = class687.method5016(class737.field10747, class239.field2981, class532.field7284, 2) - class13.field162;
         }

         int var4 = class612.field8550 * 512 + 256;
         int var5 = class484.field6672 * 512 - -256;
         int var6 = class687.method5016(var5, class239.field2981, var4, 2) + -class510.field7064;
         int var7 = -class737.field10747 + var5;
         int var8 = -class331.field4733 + var6;
         int var9 = -class532.field7284 + var4;
         int var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
         int var11 = 16383 & (int)(Math.atan2((double)var8, (double)var10) * 2607.5945876176133D);
         if (~var11 > -1025) {
            var11 = 1024;
         }

         int var12 = (int)(Math.atan2((double)var7, (double)var9) * -2607.5945876176133D) & 16383;
         if (var11 > 3072) {
            var11 = 3072;
         }

         if (class171.field2144 < var11) {
            class171.field2144 += (-class171.field2144 + var11 >> 3) * class708.field10287 / 1000 + class706.field10251 << 3;
            if (~class171.field2144 < ~var11) {
               class171.field2144 = var11;
            }
         }

         if (~var11 > ~class171.field2144) {
            class171.field2144 -= class706.field10251 - -((-var11 + class171.field2144 >> 3) * class708.field10287 / 1000) << 3;
            if (~var11 < ~class171.field2144) {
               class171.field2144 = var11;
            }
         }

         int var13 = -class749.field10899 + var12;
         if (var13 > 8192) {
            var13 -= 16384;
         }

         if (var13 < -8192) {
            var13 += 16384;
         }

         int var14 = var13 >> 3;
         if (var14 > 0) {
            class749.field10899 += class708.field10287 * var14 / 1000 + class706.field10251 << 3;
            class749.field10899 &= 16383;
         }

         if (var14 < 0) {
            class749.field10899 -= -var14 * class708.field10287 / 1000 + class706.field10251 << 3;
            class749.field10899 &= 16383;
         }

         int var15 = -class749.field10899 + var12;
         if (~var15 < -8193) {
            var15 -= 16384;
         }

         if (~var15 > 8191) {
            var15 += 16384;
         }

         if (arg0 <= 90) {
            method4346(-68);
         }

         if (~var15 > -1 && var14 > 0 || var15 > 0 && var14 < 0) {
            class749.field10899 = var12;
         }

         class191.field2317 = 0;
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field8299[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(ILjava/lang/String;B)Lkca;"
   )
   public static final class90 method4347(int arg0, String arg1, byte arg2) {
      try {
         ++field8297;
         if (arg2 != 83) {
            return null;
         } else {
            class90 var3;
            try {
               var3 = (class90)Class.forName(field8299[7]).newInstance();
            } catch (Throwable var5) {
               var3 = new class117();
            }

            var3.field1144 = arg0;
            var3.field1146 = arg1;
            return var3;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8299[5] + arg0 + ',' + (arg1 != null ? field8299[4] : field8299[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4348(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4349(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
