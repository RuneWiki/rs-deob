import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public abstract class class680 extends class713 {
   @OriginalMember(
      owner = "client!pia",
      name = "y",
      descriptor = "S"
   )
   public short field10010;
   @OriginalMember(
      owner = "client!pia",
      name = "u",
      descriptor = "S"
   )
   public short field10011;
   @OriginalMember(
      owner = "client!pia",
      name = "F",
      descriptor = "S"
   )
   public short field10015;
   @OriginalMember(
      owner = "client!pia",
      name = "x",
      descriptor = "B"
   )
   public byte field10012;
   @OriginalMember(
      owner = "client!pia",
      name = "B",
      descriptor = "Z"
   )
   public boolean field10021;
   @OriginalMember(
      owner = "client!pia",
      name = "A",
      descriptor = "S"
   )
   public short field10020;
   @OriginalMember(
      owner = "client!pia",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10022 = new String[]{method4962(method4961("U^Fd&d\u001f")), method4962(method4961("U^Fd/\r")), method4962(method4961("U^Fd(d\u001f")), method4962(method4961("^\u0019\td\u001c")), method4962(method4961("KBK&")), method4962(method4961("U^Fd3\r")), method4962(method4961("U^Fd]LYN>_\r")), method4962(method4961("U^Fd\"\r")), method4962(method4961("U^Fd'd\u001f")), method4962(method4961("U^Fd#\r"))};
   @OriginalMember(
      owner = "client!pia",
      name = "v",
      descriptor = "I"
   )
   public static int field10009;
   @OriginalMember(
      owner = "client!pia",
      name = "H",
      descriptor = "I"
   )
   public static int field10014;
   @OriginalMember(
      owner = "client!pia",
      name = "E",
      descriptor = "I"
   )
   public static int field10016;
   @OriginalMember(
      owner = "client!pia",
      name = "C",
      descriptor = "I"
   )
   public static int field10017;
   @OriginalMember(
      owner = "client!pia",
      name = "w",
      descriptor = "I"
   )
   public static int field10018;
   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "I"
   )
   public static int field10019;
   @OriginalMember(
      owner = "client!pia",
      name = "G",
      descriptor = "Lfd;"
   )
   public static class471 field10013;

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(I[Lue;)I"
   )
   public final int method240(int param1, class243[] param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pia",
      name = "f",
      descriptor = "(I)[Lbu;"
   )
   public static final class596[] method4958(int arg0) {
      try {
         if (arg0 < 115) {
            return null;
         } else {
            ++field10014;
            return new class596[]{class738.field10809, class700.field10253, class725.field10601};
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10022[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4959(int arg0, int arg1, int arg2) {
      try {
         ++field10018;
         if (arg2 < 23) {
            return false;
         } else {
            return (1024 & arg1) != 0;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10022[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "f",
      descriptor = "(B)V"
   )
   public void method84(byte arg0) {
      try {
         ++field10019;
         if (arg0 != 36) {
            method4959(-44, 92, -15);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10022[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "b",
      descriptor = "(ILha;)Z"
   )
   public final boolean method242(int arg0, class479 arg1) {
      try {
         ++field10009;
         if (arg0 != -5) {
            this.method84((byte)-95);
         }

         return class108.method966(super.field10459, this.field10015, this.field10010, this.method186((byte)-121, arg1), this.field10011, this.field10020, -101);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10022[2] + arg0 + ',' + (arg1 != null ? field10022[3] : field10022[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "d",
      descriptor = "(Z)Z"
   )
   public final boolean method244(boolean arg0) {
      boolean var2 = client.field1481;

      try {
         ++field10016;
         if (arg0) {
            method4958(-50);
         }

         int var3 = this.field10010;
         short var10000;
         if (var2) {
            var10000 = this.field10011;
         } else if (~var3 < ~this.field10015) {
            var10000 = 0;
            if (!var2) {
               return false;
            }
         } else {
            var10000 = this.field10011;
         }

         while(true) {
            int var4 = var10000;
            if (var2 || ~this.field10020 <= ~var4) {
               do {
                  int var5 = var3 - class699.field10231 - -class106.field1403;
                  if (var5 >= 0) {
                     if (~var5 <= ~class276.field3516.length && !var2) {
                        ++var4;
                     } else {
                        int var6 = -class664.field9833 + var4 + class106.field1403;
                        if (~var6 <= -1) {
                           if (var6 >= class276.field3516.length) {
                              if (var2) {
                                 if (class276.field3516[var5][var6]) {
                                    return true;
                                 }

                                 ++var4;
                              } else {
                                 ++var4;
                              }
                           } else {
                              if (class276.field3516[var5][var6]) {
                                 return true;
                              }

                              ++var4;
                           }
                        } else {
                           ++var4;
                        }
                     }
                  } else {
                     ++var4;
                  }
               } while(~this.field10020 <= ~var4);
            }

            ++var3;
            if (~var3 < ~this.field10015) {
               var10000 = 0;
               if (!var2) {
                  return false;
               }
            } else {
               var10000 = this.field10011;
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10022[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method4960(int arg0) {
      try {
         field10013 = null;
         if (arg0 != -1) {
            field10013 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10022[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "<init>",
      descriptor = "(IIIIIIIIIZB)V"
   )
   public class680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
      try {
         this.field10010 = (short)arg5;
         super.field10459 = (byte)arg1;
         this.field10011 = (short)arg7;
         this.field10015 = (short)arg6;
         super.field10466 = arg3;
         this.field10012 = arg10;
         super.field10467 = arg2;
         super.field10468 = arg4;
         this.field10021 = arg9;
         this.field10020 = (short)arg8;
         super.field10457 = (byte)arg0;
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field10022[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4961(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4962(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
