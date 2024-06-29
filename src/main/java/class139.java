import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class139 {
   @OriginalMember(
      owner = "client!qea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1778 = new String[]{method1105(method1104("\u0011y")), method1105(method1104("E,=F")), method1105(method1104("Pw\u007f\u0004B")), method1105(method1104("Z<0\u0004}\u0003")), method1105(method1104("Z<0\u0004|\u0003")), method1105(method1104("Z<0\u0004KD\n%XVE>y")), method1105(method1104("Z<0\u0004~\u0003")), method1105(method1104("Z<0\u0004{\u0003"))};
   @OriginalMember(
      owner = "client!qea",
      name = "h",
      descriptor = "I"
   )
   public static int field1775 = 1;
   @OriginalMember(
      owner = "client!qea",
      name = "b",
      descriptor = "I"
   )
   public static int field1769;
   @OriginalMember(
      owner = "client!qea",
      name = "g",
      descriptor = "I"
   )
   public static int field1770;
   @OriginalMember(
      owner = "client!qea",
      name = "i",
      descriptor = "I"
   )
   public static int field1771;
   @OriginalMember(
      owner = "client!qea",
      name = "e",
      descriptor = "I"
   )
   public static int field1772;
   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "I"
   )
   public static int field1776;
   @OriginalMember(
      owner = "client!qea",
      name = "d",
      descriptor = "I"
   )
   public static int field1777;
   @OriginalMember(
      owner = "client!qea",
      name = "f",
      descriptor = "Ldw;"
   )
   public static class750 field1773;
   @OriginalMember(
      owner = "client!qea",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field1774;

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;"
   )
   public static final String[] method1100(int arg0, String[] arg1) {
      boolean var2 = client.field4360;

      try {
         ++field1769;
         String[] var3 = new String[5];
         if (arg0 < 83) {
            field1773 = null;
         }

         int var4 = 0;
         if (var2) {
            var3[var4] = var4 + field1778[0];
            if (arg1 != null && arg1[var4] != null) {
               var3[var4] = var3[var4] + arg1[var4];
            }

            ++var4;
         }

         while(true) {
            String[] var10000;
            if (var4 >= 5) {
               var10000 = var3;
               if (!var2) {
                  return var3;
               }
            } else {
               var3[var4] = var4 + field1778[0];
               var10000 = arg1;
            }

            if (var10000 != null && arg1[var4] != null) {
               var3[var4] = var3[var4] + arg1[var4];
            }

            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1778[3] + arg0 + ',' + (arg1 != null ? field1778[2] : field1778[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1101(int arg0) {
      try {
         field1773 = null;
         int var1 = -3 / ((arg0 - -67) / 53);
         field1774 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1778[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method1102(byte arg0) {
      try {
         ++field1777;
         int var2 = -48 % ((67 - arg0) / 38);
         return class622.field9157 == this | class354.field4772 == this;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1778[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(Lwf;I)V"
   )
   public static final void method1103(class147 arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field1776;
         if (arg1 >= ~(arg0.field1889.length + -arg0.field1856)) {
            int var3 = arg0.method1143(arg1 ^ 15465);
            if (var3 >= 0 && ~var3 >= -2) {
               if (arg0.field1889.length - arg0.field1856 >= 2) {
                  int var4 = arg0.method1211(-26166);
                  if (var4 * 6 <= arg0.field1889.length + -arg0.field1856) {
                     int var5 = 0;
                     if (var2 || var4 > var5) {
                        do {
                           int var6 = arg0.method1211(arg1 ^ 26164);
                           int var7 = arg0.method1164(19693);
                           if (~class14.field164.length < ~var6) {
                              if (!class20.field222[var6] && !var2) {
                                 ++var5;
                              } else if (class759.field11227.method4251(var6, (byte)-99).field1646 == '1') {
                                 if (~var7 <= 0) {
                                    if (~var7 < -2) {
                                       if (var2) {
                                          class14.field164[var6] = var7;
                                          ++var5;
                                       } else {
                                          ++var5;
                                       }
                                    } else {
                                       class14.field164[var6] = var7;
                                       ++var5;
                                    }
                                 } else {
                                    ++var5;
                                 }
                              } else {
                                 class14.field164[var6] = var7;
                                 ++var5;
                              }
                           } else {
                              ++var5;
                           }
                        } while(var4 > var5);

                     }
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field1778[4] + (arg0 != null ? field1778[2] : field1778[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field1771;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1778[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1104(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1105(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
