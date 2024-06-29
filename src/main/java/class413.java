import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class413 extends class500 implements class326 {
   @OriginalMember(
      owner = "client!tm",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5818 = new String[]{method3130(method3129(".Kq\b&")), method3130(method3129(".Kq\u0006&")), method3130(method3129(".Kq\u000f&")), method3130(method3129(".Kq\r&")), method3130(method3129(".Kq\t&")), method3130(method3129(".Kq\u000b&")), method3130(method3129(".Kq\n&")), method3130(method3129(".Kq\f&"))};
   @OriginalMember(
      owner = "client!tm",
      name = "o",
      descriptor = "Lo;"
   )
   public static class31 field5801 = new class31(12, -1);
   @OriginalMember(
      owner = "client!tm",
      name = "p",
      descriptor = "C"
   )
   public char field5808;
   @OriginalMember(
      owner = "client!tm",
      name = "q",
      descriptor = "I"
   )
   public static int field5802;
   @OriginalMember(
      owner = "client!tm",
      name = "s",
      descriptor = "I"
   )
   public int field5803;
   @OriginalMember(
      owner = "client!tm",
      name = "u",
      descriptor = "I"
   )
   public int field5804;
   @OriginalMember(
      owner = "client!tm",
      name = "y",
      descriptor = "I"
   )
   public static int field5805;
   @OriginalMember(
      owner = "client!tm",
      name = "x",
      descriptor = "I"
   )
   public static int field5806;
   @OriginalMember(
      owner = "client!tm",
      name = "t",
      descriptor = "I"
   )
   public static int field5807;
   @OriginalMember(
      owner = "client!tm",
      name = "n",
      descriptor = "I"
   )
   public static int field5809;
   @OriginalMember(
      owner = "client!tm",
      name = "r",
      descriptor = "I"
   )
   public static int field5810;
   @OriginalMember(
      owner = "client!tm",
      name = "j",
      descriptor = "I"
   )
   public static int field5811;
   @OriginalMember(
      owner = "client!tm",
      name = "m",
      descriptor = "I"
   )
   public static int field5812;
   @OriginalMember(
      owner = "client!tm",
      name = "l",
      descriptor = "I"
   )
   public int field5815;
   @OriginalMember(
      owner = "client!tm",
      name = "z",
      descriptor = "J"
   )
   public long field5813;
   @OriginalMember(
      owner = "client!tm",
      name = "w",
      descriptor = "[Lbo;"
   )
   public static class763[] field5816;
   @OriginalMember(
      owner = "client!tm",
      name = "k",
      descriptor = "[S"
   )
   public static short[] field5814;
   @OriginalMember(
      owner = "client!tm",
      name = "v",
      descriptor = "[[[Z"
   )
   public static boolean[][][] field5817;

   @OriginalMember(
      owner = "client!tm",
      name = "b",
      descriptor = "(B)J"
   )
   public final long method2466(byte arg0) {
      try {
         ++field5806;
         return arg0 != 51 ? -60L : this.field5813;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5818[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method3126(byte arg0) {
      try {
         int var1 = -81 / ((27 - arg0) / 63);
         field5801 = null;
         field5817 = null;
         field5814 = null;
         field5816 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5818[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(II)Ldha;"
   )
   public static final class84 method3127(int arg0, int arg1) {
      try {
         ++field5810;
         if (arg1 < 53) {
            return null;
         } else {
            if (~arg0 != -1) {
               if (~arg0 == -2) {
                  if ((double)class618.field8619 == 3.0D) {
                     return class621.field8679;
                  }

                  if ((double)class618.field8619 == 4.0D) {
                     return class469.field6491;
                  }

                  if ((double)class618.field8619 == 6.0D) {
                     return class76.field953;
                  }

                  if ((double)class618.field8619 >= 8.0D) {
                     return class522.field7146;
                  }
               } else if (~arg0 == -3) {
                  if ((double)class618.field8619 == 3.0D) {
                     return class76.field953;
                  }

                  if ((double)class618.field8619 == 4.0D) {
                     return class522.field7146;
                  }

                  if ((double)class618.field8619 == 6.0D) {
                     return class178.field2210;
                  }

                  if ((double)class618.field8619 >= 8.0D) {
                     return class509.field7051;
                  }
               }
            } else {
               if ((double)class618.field8619 == 3.0D) {
                  return class524.field7181;
               }

               if ((double)class618.field8619 == 4.0D) {
                  return class264.field3446;
               }

               if ((double)class618.field8619 == 6.0D) {
                  return class621.field8679;
               }

               if ((double)class618.field8619 >= 8.0D) {
                  return class469.field6491;
               }
            }

            return null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5818[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(IBI)B"
   )
   public static final byte method3128(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 != 12) {
            field5814 = null;
         }

         ++field5812;
         if (arg0 != 9) {
            return 0;
         } else {
            return (byte)(~(1 & arg2) != -1 ? 2 : 1);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5818[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method2468(byte arg0) {
      try {
         ++field5802;
         if (arg0 >= -53) {
            this.method2468((byte)59);
         }

         return this.field5804;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5818[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "b",
      descriptor = "(I)C"
   )
   public final char method2467(int arg0) {
      try {
         ++field5807;
         if (arg0 <= 56) {
            this.field5808 = 'd';
         }

         return this.field5808;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5818[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method2465(int arg0) {
      try {
         ++field5809;
         return arg0 != 18392 ? 72 : this.field5803;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5818[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method2469(byte arg0) {
      try {
         if (arg0 != 66) {
            this.method2467(-72);
         }

         ++field5805;
         return this.field5815;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5818[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3129(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3130(char[] arg0) {
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
            var10005 = 38;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
