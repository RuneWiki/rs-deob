import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class5 {
   @OriginalMember(
      owner = "client!uha",
      name = "c",
      descriptor = "I"
   )
   public int field69;
   @OriginalMember(
      owner = "client!uha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field74 = new String[]{method46(method45("<pI[ba")), method46(method45("<pI[`a")), method46(method45("<pI[W&K\\\u0007J'\u007f\u0000")), method46(method45("<pI[aa")), method46(method45("<pI[ga")), method46(method45("<pI[\u001f vA\u0001\u001da"))};
   @OriginalMember(
      owner = "client!uha",
      name = "f",
      descriptor = "Loca;"
   )
   public static class642 field66 = null;
   @OriginalMember(
      owner = "client!uha",
      name = "h",
      descriptor = "Llr;"
   )
   public static class348 field70 = new class348();
   @OriginalMember(
      owner = "client!uha",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field73 = new int[3];
   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "I"
   )
   public static int field67;
   @OriginalMember(
      owner = "client!uha",
      name = "b",
      descriptor = "I"
   )
   public static int field68;
   @OriginalMember(
      owner = "client!uha",
      name = "e",
      descriptor = "I"
   )
   public static int field71;
   @OriginalMember(
      owner = "client!uha",
      name = "g",
      descriptor = "I"
   )
   public static int field72;

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "(Z)I"
   )
   public static final int method41(boolean arg0) {
      try {
         ++field71;
         return arg0 ? 24 : class567.field8341++;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field74[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "(IJ)V"
   )
   public static final void method42(int arg0, long arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg0 < -82) {
            ++field67;
            int var4 = class584.field8628 + class204.field2593.field10467;
            int var5 = class539.field7884 + class204.field2593.field10468;
            if (~(-var4 + class70.field942) > 1999 || class70.field942 - var4 > 2000 || ~(class95.field1290 - var5) > 1999 || -var5 + class95.field1290 > 2000) {
               class70.field942 = var4;
               class95.field1290 = var5;
            }

            if (class70.field942 != var4) {
               int var7;
               label96: {
                  int var6 = -class70.field942 + var4;
                  var7 = (int)((long)var6 * arg1 / 320L);
                  if (var6 <= 0) {
                     if (~var7 != -1) {
                        if (~var7 <= ~var6) {
                           break label96;
                        }

                        var7 = var6;
                        if (!var3) {
                           break label96;
                        }
                     }

                     var7 = -1;
                     if (!var3) {
                        break label96;
                     }
                  }

                  if (~var7 != -1) {
                     if (~var7 >= ~var6) {
                        break label96;
                     }

                     var7 = var6;
                     if (!var3) {
                        break label96;
                     }
                  }

                  var7 = 1;
               }

               class70.field942 += var7;
            }

            class623.field9202 += (float)arg1 * class784.field11461 / 6.0F;
            if (class95.field1290 != var5) {
               int var9;
               label97: {
                  int var8 = -class95.field1290 + var5;
                  var9 = (int)((long)var8 * arg1 / 320L);
                  if (var8 > 0) {
                     if (~var9 == -1) {
                        var9 = 1;
                        if (!var3) {
                           break label97;
                        }
                     }

                     if (var9 <= var8) {
                        break label97;
                     }

                     var9 = var8;
                     if (!var3) {
                        break label97;
                     }
                  }

                  if (var9 != 0) {
                     if (var9 >= var8) {
                        break label97;
                     }

                     var9 = var8;
                     if (!var3) {
                        break label97;
                     }
                  }

                  var9 = -1;
               }

               class95.field1290 += var9;
            }

            class250.field3162 += (float)arg1 * class419.field5734 / 6.0F;
            class223.method1783((byte)-101);
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field74[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method43(byte arg0) {
      try {
         field70 = null;
         if (arg0 != 19) {
            method42(60, -108L);
         }

         field66 = null;
         field73 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field74[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field68;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field74[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "b",
      descriptor = "(B)Z"
   )
   public static final boolean method44(byte arg0) {
      try {
         ++field72;
         if (~class157.field2022 != -4) {
            return false;
         } else if (~class623.field9218 == -1 && ~class571.field8393 == -1) {
            return arg0 == -29;
         } else {
            return false;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field74[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class5(int arg0, int arg1) {
      try {
         this.field69 = arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field74[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method45(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method46(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
