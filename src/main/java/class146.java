import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class146 extends class55 {
   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1855 = new String[]{method1140(method1139("\fw}\u0003\u007f")), method1140(method1139("\u001a:}g*")), method1140(method1139("\u0019,?A")), method1140(method1139("\u001a:}e*")), method1140(method1139("\u001a:}o*")), method1140(method1139("\u001a:}l*")), method1140(method1139("\u001a:}h*")), method1140(method1139("\u001a:}n*")), method1140(method1139("\u001a:}j*")), method1140(method1139("\u001a:}d*")), method1140(method1139("\u001a:}k*")), method1140(method1139("\u001a:}i*"))};
   @OriginalMember(
      owner = "client!mc",
      name = "i",
      descriptor = "I"
   )
   public static int field1843 = -1;
   @OriginalMember(
      owner = "client!mc",
      name = "p",
      descriptor = "Lgca;"
   )
   public static class263 field1847;
   @OriginalMember(
      owner = "client!mc",
      name = "o",
      descriptor = "Lgca;"
   )
   public static class263 field1851 = field1847 = new class263(false);
   @OriginalMember(
      owner = "client!mc",
      name = "m",
      descriptor = "I"
   )
   public static int field1842;
   @OriginalMember(
      owner = "client!mc",
      name = "n",
      descriptor = "I"
   )
   public static int field1844;
   @OriginalMember(
      owner = "client!mc",
      name = "l",
      descriptor = "I"
   )
   public static int field1845;
   @OriginalMember(
      owner = "client!mc",
      name = "g",
      descriptor = "I"
   )
   public static int field1846;
   @OriginalMember(
      owner = "client!mc",
      name = "q",
      descriptor = "I"
   )
   public static int field1848;
   @OriginalMember(
      owner = "client!mc",
      name = "k",
      descriptor = "I"
   )
   public static int field1849;
   @OriginalMember(
      owner = "client!mc",
      name = "j",
      descriptor = "I"
   )
   public static int field1850;
   @OriginalMember(
      owner = "client!mc",
      name = "e",
      descriptor = "I"
   )
   public static int field1853;
   @OriginalMember(
      owner = "client!mc",
      name = "f",
      descriptor = "I"
   )
   public static int field1854;
   @OriginalMember(
      owner = "client!mc",
      name = "h",
      descriptor = "Lkf;"
   )
   public static class266 field1852;

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method97(int arg0, byte arg1) {
      try {
         if (arg1 != 105) {
            this.method97(49, (byte)-106);
         }

         ++field1854;
         return super.field683.method3300((byte)-56) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1855[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(ILjava/lang/String;Z)V"
   )
   public static final void method1133(int arg0, String arg1, boolean arg2) {
      boolean var3 = client.field4360;

      try {
         ++field1846;
         if (arg1 != null) {
            if (class640.field9356 >= arg0) {
               class684.method4989(class180.field2518.method1437(class608.field8920, 50), 4, 4095);
            } else {
               String var4 = class738.method5357(arg0 + -189, arg1);
               if (var4 != null) {
                  byte var10000;
                  label95: {
                     int var5 = 0;
                     if (var3) {
                        var10000 = -23;
                     } else if (class640.field9356 <= var5) {
                        var10000 = 0;
                        if (!var3) {
                           break label95;
                        }
                     } else {
                        var10000 = -23;
                     }

                     while(true) {
                        String var6 = class738.method5357(var10000, class640.field9350[var5]);
                        if (var6 != null && var6.equals(var4)) {
                           class684.method4989(arg1 + class180.field2519.method1437(class608.field8920, 50), 4, 4095);
                           return;
                        }

                        if (class295.field4068[var5] != null) {
                           String var7 = class738.method5357(-71, class295.field4068[var5]);
                           if (var7 != null && var7.equals(var4)) {
                              class684.method4989(arg1 + class180.field2519.method1437(class608.field8920, 50), 4, 4095);
                              return;
                           }
                        }

                        ++var5;
                        if (class640.field9356 <= var5) {
                           var10000 = 0;
                           if (!var3) {
                              break;
                           }
                        } else {
                           var10000 = -23;
                        }
                     }
                  }

                  int var8 = var10000;
                  class10 var11;
                  class447 var12;
                  int var15;
                  if (var3) {
                     var15 = arg0 ^ -78;
                  } else if (var8 >= class710.field10360) {
                     var15 = class738.method5357(-57, class564.field8045.field1575).equals(var4);
                     if (!var3) {
                        if (var15 != 0) {
                           class684.method4989(class180.field2521.method1437(class608.field8920, 50), 4, arg0 ^ 3995);
                           return;
                        }

                        ++class689.field10148;
                        var11 = class292.method2192(-9730);
                        var12 = class40.method350(class580.field8543, var11.field106, true);
                        var12.field6359.method1186(class89.method783(arg0 ^ 101, arg1) - -1, 0);
                        var12.field6359.method1195((byte)54, arg1);
                        var12.field6359.method1186(arg2 ? 1 : 0, 0);
                        var11.method55(13256, var12);
                        return;
                     }
                  } else {
                     var15 = arg0 ^ -78;
                  }

                  while(true) {
                     String var9 = class738.method5357(var15, class581.field8554[var8]);
                     if (var9 != null && var9.equals(var4)) {
                        class684.method4989(class180.field2524.method1437(class608.field8920, arg0 ^ 86) + arg1 + class180.field2525.method1437(class608.field8920, 50), 4, 4095);
                        return;
                     }

                     if (class9.field88[var8] != null) {
                        String var10 = class738.method5357(-60, class9.field88[var8]);
                        if (var10 != null && var10.equals(var4)) {
                           class684.method4989(class180.field2524.method1437(class608.field8920, 50) + arg1 + class180.field2525.method1437(class608.field8920, 50), 4, arg0 + 3995);
                           return;
                        }
                     }

                     ++var8;
                     if (var8 >= class710.field10360) {
                        var15 = class738.method5357(-57, class564.field8045.field1575).equals(var4);
                        if (!var3) {
                           if (var15 != 0) {
                              class684.method4989(class180.field2521.method1437(class608.field8920, 50), 4, arg0 ^ 3995);
                              return;
                           }

                           ++class689.field10148;
                           var11 = class292.method2192(-9730);
                           var12 = class40.method350(class580.field8543, var11.field106, true);
                           var12.field6359.method1186(class89.method783(arg0 ^ 101, arg1) - -1, 0);
                           var12.field6359.method1195((byte)54, arg1);
                           var12.field6359.method1186(arg2 ? 1 : 0, 0);
                           var11.method55(13256, var12);
                           return;
                        }
                     } else {
                        var15 = arg0 ^ -78;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field1855[9] + arg0 + ',' + (arg1 != null ? field1855[0] : field1855[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method1134(byte arg0) {
      try {
         if (arg0 != 120) {
            method1137(true);
         }

         ++field1848;
         return !super.field683.method3300((byte)-56);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1855[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method1135(int arg0) {
      try {
         ++field1842;
         int var2 = -128 % ((arg0 - 36) / 41);
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1855[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method96(int arg0, byte arg1) {
      try {
         ++field1849;
         super.field680 = arg0;
         int var3 = 20 / ((arg1 - 47) / 46);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1855[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(IIIBLrv;)V"
   )
   public static final void method1136(int param0, int param1, int param2, byte param3, class121 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mc",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method1137(boolean arg0) {
      try {
         field1847 = null;
         if (arg0) {
            method1137(true);
         }

         field1852 = null;
         field1851 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1855[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(Lmk;I)Z"
   )
   public static final boolean method1138(class62 arg0, int arg1) {
      try {
         if (arg1 != -1) {
            return false;
         } else {
            ++field1845;
            return arg0 == null ? false : class787.method5685(arg0.field751, arg0.field752, -arg0.field752 + arg0.field756, -arg0.field751 + arg0.field763, (byte)115, arg0.field755, -arg0.field755 + arg0.field759);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1855[4] + (arg0 != null ? field1855[0] : field1855[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "<init>",
      descriptor = "(Lifa;)V"
   )
   public class146(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!mc",
      name = "<init>",
      descriptor = "(ILifa;)V"
   )
   public class146(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method98(int arg0) {
      try {
         ++field1844;
         if (super.field683.method3300((byte)-56)) {
            super.field680 = 2;
         }

         if (arg0 > super.field680 || super.field680 > 2) {
            super.field680 = this.method101(-117);
         }

      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1855[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method101(int arg0) {
      try {
         if (arg0 > -116) {
            field1843 = -66;
         }

         ++field1850;
         if (!super.field683.method3300((byte)-56)) {
            return super.field683.field6419.method386(3) && class348.method2544(super.field683.field6419.method391(122), 80) ? 1 : 0;
         } else {
            return 2;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1855[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1139(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1140(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
