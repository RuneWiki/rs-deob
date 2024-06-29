import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class44 extends class70 {
   @OriginalMember(
      owner = "client!k",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field574 = new String[]{method335(method334("\u00152k`")), method335(method334("\u00152h`")), method335(method334("\u00152j`")), method335(method334("\u00152``")), method335(method334("\u00152g`"))};
   @OriginalMember(
      owner = "client!k",
      name = "N",
      descriptor = "Lsia;"
   )
   public static class407 field570 = new class407(20);
   @OriginalMember(
      owner = "client!k",
      name = "J",
      descriptor = "[I"
   )
   public static int[] field573 = new int[2];
   @OriginalMember(
      owner = "client!k",
      name = "M",
      descriptor = "I"
   )
   public static int field566;
   @OriginalMember(
      owner = "client!k",
      name = "L",
      descriptor = "I"
   )
   public static int field567;
   @OriginalMember(
      owner = "client!k",
      name = "O",
      descriptor = "I"
   )
   public static int field568;
   @OriginalMember(
      owner = "client!k",
      name = "K",
      descriptor = "I"
   )
   public static int field569;
   @OriginalMember(
      owner = "client!k",
      name = "P",
      descriptor = "Let;"
   )
   public static class753 field571;
   @OriginalMember(
      owner = "client!k",
      name = "I",
      descriptor = "[Lhga;"
   )
   public static class196[] field572;

   @OriginalMember(
      owner = "client!k",
      name = "<init>",
      descriptor = "()V"
   )
   public class44() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!k",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method329(int arg0) {
      try {
         if (arg0 != 21726) {
            method333((byte)-69);
         }

         field572 = null;
         field571 = null;
         field570 = null;
         field573 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field574[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(IBI)I"
   )
   private final int method330(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 != 56) {
            return -110;
         } else {
            ++field568;
            int var4 = arg2 * 57 + arg0;
            int var5 = var4 ^ var4 << 1;
            return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field574[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field566;
         if (arg0 != -63) {
            this.method330(-115, (byte)35, 126);
         }

         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int var5 = class502.field6979[arg1];
            int var6 = 0;
            if (var3 || ~class262.field3328 < ~var6) {
               do {
                  var4[var6] = this.method330(class17.field290[var6], (byte)56, var5) % 4096;
                  ++var6;
               } while(~class262.field3328 < ~var6);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field574[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(BJ)Ljava/lang/String;"
   )
   public static final String method332(byte arg0, long arg1) {
      boolean var3 = client.field1481;

      try {
         ++field569;
         if (~arg1 < -1L && ~arg1 > -6582952005840035282L) {
            if (arg1 % 37L == 0L) {
               return null;
            } else {
               int var4 = 0;
               long var5 = arg1;
               if (var3) {
                  var5 = arg1 / 37L;
                  ++var4;
               }

               while(true) {
                  while(var5 != 0L) {
                     var5 /= 37L;
                     ++var4;
                  }

                  StringBuffer var7 = new StringBuffer(var4);
                  if (!var3) {
                     if (!var3 && arg1 == 0L) {
                        if (arg0 != -115) {
                           method332((byte)-78, 111L);
                        }

                        var7.reverse();
                        var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
                        return var7.toString();
                     } else {
                        do {
                           long var8 = arg1;
                           arg1 /= 37L;
                           char var10 = class440.field5986[(int)(-(arg1 * 37L) + var8)];
                           if (var10 == '_') {
                              int var11 = var7.length() + -1;
                              var10 = 160;
                              var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                           }

                           var7.append(var10);
                        } while(arg1 != 0L);

                        if (arg0 != -115) {
                           method332((byte)-78, 111L);
                        }

                        var7.reverse();
                        var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
                        return var7.toString();
                     }
                  }

                  ++var4;
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field574[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method333(byte arg0) {
      boolean var1 = client.field1481;

      try {
         if (class475.field6627 != null) {
            int var2 = 0;
            if (var1 || ~class475.field6627.length < ~var2) {
               do {
                  int var3 = 0;
                  if (var1) {
                     class475.field6627[var2][var3] = class568.field8355;
                     ++var3;
                  }

                  while(true) {
                     while(class475.field6627[var2].length > var3) {
                        class475.field6627[var2][var3] = class568.field8355;
                        ++var3;
                     }

                     if (!var1) {
                        ++var2;
                        break;
                     }

                     ++var3;
                  }
               } while(~class475.field6627.length < ~var2);
            }
         }

         ++field567;
         if (arg0 != 46) {
            method332((byte)88, -17L);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field574[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method334(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method335(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
