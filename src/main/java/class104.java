import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class104 {
   @OriginalMember(
      owner = "client!dja",
      name = "l",
      descriptor = "Z"
   )
   public boolean field1642 = false;
   @OriginalMember(
      owner = "client!dja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1643 = new String[]{method1025(method1024("\n\u000e)>WF")), method1025(method1024("\n\u000e)>RF")), method1025(method1024("\u0000\u0011$|")), method1025(method1024("\u0015Jf>n")), method1025(method1024("\n\u000e)>VF")), method1025(method1024("\n\u000e)>PF")), method1025(method1024("\n\u000e)>QF")), method1025(method1024("\n\u000e)>UF")), method1025(method1024("\n\u000e)>TF"))};
   @OriginalMember(
      owner = "client!dja",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field1637 = new int[1];
   @OriginalMember(
      owner = "client!dja",
      name = "c",
      descriptor = "Lhha;"
   )
   public static class724 field1632 = new class724(98, 5);
   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "I"
   )
   public static int field1631;
   @OriginalMember(
      owner = "client!dja",
      name = "h",
      descriptor = "I"
   )
   public int field1633;
   @OriginalMember(
      owner = "client!dja",
      name = "k",
      descriptor = "I"
   )
   public static int field1634;
   @OriginalMember(
      owner = "client!dja",
      name = "d",
      descriptor = "I"
   )
   public static int field1635;
   @OriginalMember(
      owner = "client!dja",
      name = "g",
      descriptor = "I"
   )
   public static int field1638;
   @OriginalMember(
      owner = "client!dja",
      name = "b",
      descriptor = "I"
   )
   public static int field1639;
   @OriginalMember(
      owner = "client!dja",
      name = "j",
      descriptor = "I"
   )
   public int field1640;
   @OriginalMember(
      owner = "client!dja",
      name = "i",
      descriptor = "I"
   )
   public static int field1641;
   @OriginalMember(
      owner = "client!dja",
      name = "e",
      descriptor = "Lgl;"
   )
   public class282 field1636;

   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "(BLcu;I)V"
   )
   private final void method1017(byte arg0, class65 arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label52: {
            if (~arg2 == -2) {
               this.field1640 = arg1.method685(-2);
               if (!var4) {
                  break label52;
               }
            }

            if (~arg2 != -3) {
               if (~arg2 == -4) {
                  this.field1642 = true;
                  if (!var4) {
                     break label52;
                  }
               }

               if (arg2 != 4) {
                  break label52;
               }

               this.field1640 = -1;
               if (!var4) {
                  break label52;
               }
            }

            this.field1633 = arg1.method691((byte)-126);
         }

         if (arg0 != -119) {
            method1019(48, (byte)16);
         }

         ++field1641;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1643[6] + arg0 + ',' + (arg1 != null ? field1643[3] : field1643[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1018(boolean arg0) {
      try {
         field1632 = null;
         if (arg0) {
            method1018(true);
         }

         field1637 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1643[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method1019(int arg0, byte arg1) {
      try {
         ++field1635;
         if (arg1 <= 53) {
            field1637 = null;
         }

         return arg0 == 9 || arg0 == 10;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1643[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "(ILha;ZI)Lma;"
   )
   public final class148 method1020(int arg0, class17 arg1, boolean arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         ++field1631;
         long var6 = (long)(arg1.field241 << 19 | (arg2 ? 262144 : 0) | arg3 << 16 | this.field1640);
         class148 var8 = (class148)this.field1636.field4257.method1041(var6, 8);
         if (var8 != null) {
            return var8;
         } else if (arg0 != 1) {
            return null;
         } else if (!this.field1636.field4252.method450(0, this.field1640)) {
            return null;
         } else {
            class433 var9 = class433.method3382(this.field1636.field4252, this.field1640, 0);
            if (var9 != null) {
               var9.field6359 = var9.field6355 = var9.field6360 = var9.field6358 = 0;
               if (arg2) {
                  var9.method3376();
               }

               int var10 = 0;
               if (var5) {
                  var9.method3378();
                  ++var10;
               }

               while(var10 < arg3) {
                  var9.method3378();
                  ++var10;
               }
            }

            class148 var11 = arg1.method187(var9, true);
            if (var11 != null) {
               this.field1636.field4257.method1050(-126, var11, var6);
            }

            return var11;
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field1643[1] + arg0 + ',' + (arg1 != null ? field1643[3] : field1643[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "(Lcu;B)V"
   )
   public final void method1021(class65 arg0, byte arg1) {
      boolean var3 = client.field10022;

      try {
         while(true) {
            int var4 = arg0.method665(false);
            if (var4 != 0) {
               this.method1017((byte)-119, arg0, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field1634;
            break;
         }

         if (arg1 != -56) {
            this.method1020(-118, (class17)null, false, -7);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1643[8] + (arg0 != null ? field1643[3] : field1643[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "(BI)I"
   )
   public static final int method1022(byte arg0, int arg1) {
      try {
         if (arg0 <= 101) {
            return -6;
         } else {
            ++field1639;
            if (~arg1 == -6407) {
               return 1;
            } else if (~arg1 == -6410) {
               return 1;
            } else if (arg1 != 32841) {
               if (~arg1 != -6411) {
                  if (~arg1 != -6408) {
                     if (arg1 == 6408) {
                        return 4;
                     } else {
                        throw new IllegalArgumentException("");
                     }
                  } else {
                     return 3;
                  }
               } else {
                  return 2;
               }
            } else {
               return 1;
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1643[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1023(int arg0) {
      try {
         ++field1638;
         if (arg0 >= -18) {
            this.field1633 = 27;
         }

         return this.field1636.field4252.method450(0, this.field1640);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1643[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1024(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1025(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
