import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class433 extends class454 {
   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5913 = new String[]{method3358(method3357("V\n6\u00102\r")), method3358(method3357("V\n6\u00103\r")), method3358(method3357("V\n6\u0010?\r")), method3358(method3357("V\n6\u00105\r")), method3358(method3357("V\n6\u0010:\r")), method3358(method3357("V\n6\u00109\r")), method3358(method3357("K\u001d;R")), method3358(method3357("^Fy\u0010\u0000")), method3358(method3357("V\n6\u0010>\r")), method3358(method3357("V\n6\u0010;\r")), method3358(method3357("V\n6\u00108\r")), method3358(method3357("V\n6\u0010<\r"))};
   @OriginalMember(
      owner = "client!sba",
      name = "p",
      descriptor = "Laka;"
   )
   public static class418 field5904 = new class418(49, -1);
   @OriginalMember(
      owner = "client!sba",
      name = "r",
      descriptor = "I"
   )
   public static int field5908 = 0;
   @OriginalMember(
      owner = "client!sba",
      name = "i",
      descriptor = "I"
   )
   public static int field5906 = -1;
   @OriginalMember(
      owner = "client!sba",
      name = "l",
      descriptor = "I"
   )
   public static int field5901;
   @OriginalMember(
      owner = "client!sba",
      name = "n",
      descriptor = "I"
   )
   public static int field5902;
   @OriginalMember(
      owner = "client!sba",
      name = "q",
      descriptor = "I"
   )
   public static int field5903;
   @OriginalMember(
      owner = "client!sba",
      name = "t",
      descriptor = "I"
   )
   public static int field5905;
   @OriginalMember(
      owner = "client!sba",
      name = "k",
      descriptor = "I"
   )
   public static int field5907;
   @OriginalMember(
      owner = "client!sba",
      name = "j",
      descriptor = "I"
   )
   public static int field5909;
   @OriginalMember(
      owner = "client!sba",
      name = "m",
      descriptor = "I"
   )
   public static int field5910;
   @OriginalMember(
      owner = "client!sba",
      name = "s",
      descriptor = "I"
   )
   public static int field5911;
   @OriginalMember(
      owner = "client!sba",
      name = "o",
      descriptor = "I"
   )
   public static int field5912;

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         if (!arg0) {
            field5908 = -61;
         }

         ++field5902;
         if (super.field6263 < 0 && ~super.field6263 < -128) {
            super.field6263 = this.method23(1);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5913[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class433(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!sba",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3351(int arg0) {
      try {
         if (arg0 != -18033) {
            method3356((int[])null, 78, (String[])null);
         }

         ++field5911;
         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5913[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         if (arg1) {
            field5904 = null;
         }

         ++field5907;
         return 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5913[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         ++field5909;
         if (arg0 != 1) {
            field5908 = 68;
         }

         return 127;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5913[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class433(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(BII)I"
   )
   public static final int method3352(byte arg0, int arg1, int arg2) {
      try {
         ++field5901;
         if (~arg1 != -2 && ~arg1 != -4) {
            if (arg0 != 14) {
               method3355((byte)-112);
            }

            return class631.field9308[3 & arg2];
         } else {
            return class127.field1636[3 & arg2];
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5913[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method3353(int arg0, int arg1) {
      try {
         class223.field2792 = class387.field5365;
         ++field5912;
         class413.field5674 = 2;
         class139.field1755 = arg1;
         String var2 = null;
         if (arg0 > -66) {
            field5908 = 29;
         }

         if (class226.field2825 != null) {
            class66 var3 = new class66(class226.field2825);
            var2 = class550.method4166(37, var3.method660(127));
            class10.field235 = var3.method660(119);
         }

         if (var2 == null) {
            class419.method3265((byte)-78, 35);
         } else {
            class670.method4886(var2, (byte)108, "", true, false);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5913[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "b",
      descriptor = "(BI)I"
   )
   public static final int method3354(byte arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field5905;
         if (arg0 != 111) {
            field5906 = -77;
         }

         byte var3;
         label42: {
            if (arg1 > 12000) {
               var3 = 4;
               class435.method3362((byte)84);
               if (!var2) {
                  break label42;
               }
            }

            if (~arg1 < -5001) {
               class384.method3042(true);
               var3 = 3;
               if (!var2) {
                  break label42;
               }
            }

            if (~arg1 >= -2001) {
               var3 = 1;
               class743.method5390((byte)61, true);
               if (!var2) {
                  break label42;
               }
            }

            var3 = 2;
            class551.method4170(0);
         }

         if (class757.field11093.field11012.method27(-18033) != 2) {
            class757.field11093.method5438(true, class757.field11093.field10997, 2);
            class214.method1749(2, false, 112);
         }

         class654.method4804((byte)-123);
         return var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5913[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3355(byte arg0) {
      try {
         int var1 = 53 / ((81 - arg0) / 43);
         field5904 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5913[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "([II[Ljava/lang/String;)V"
   )
   public static final void method3356(int[] arg0, int arg1, String[] arg2) {
      try {
         class318.method2513(0, arg2, -4890, arg2.length - 1, arg0);
         int var3 = -53 % ((arg1 - -47) / 46);
         ++field5903;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5913[8] + (arg0 != null ? field5913[7] : field5913[6]) + ',' + arg1 + ',' + (arg2 != null ? field5913[7] : field5913[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         if (arg0 > -46) {
            method3353(-93, 93);
         }

         ++field5910;
         super.field6263 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5913[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3357(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3358(char[] arg0) {
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
            var10005 = 104;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
