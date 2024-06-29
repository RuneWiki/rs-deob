import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class458 extends class345 {
   @OriginalMember(
      owner = "client!rp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6725 = new String[]{method3450(method3449("f\u0014\u000b\u001e'")), method3450(method3449("oJ\u000bsr")), method3450(method3449("z\u0011I1")), method3450(method3449("f\u0014\u000b\u0015'")), method3450(method3449("f\u0014\u000b\u0016'")), method3450(method3449("f\u0014\u000b\u0014'")), method3450(method3449("f\u0014\u000b\u0019'")), method3450(method3449("f\u0014\u000b\u0011'")), method3450(method3449("f\u0014\u000b\u0017'")), method3450(method3449("f\u0014\u000b\u0018'")), method3450(method3449("y\u0005U;cu\u0003")), method3450(method3449("w\u000bH-ng\u0017")), method3450(method3449("|\rQ?nf;A8iu\u0011I)")), method3450(method3449("z\u0005H8P}\u0007J3|")), method3450(method3449("|\rK)P|\u0001D9fw\u000bK.")), method3450(method3449("w\u0016J.|")), method3450(method3449("y\u0005U9``\u0017")), method3450(method3449("{\u0010M8}x\u0001S8c")), method3450(method3449("f\u0014\u000b\u001c'")), method3450(method3449("|\rK)Py\u0005U8ks\u0001")), method3450(method3449("|\rQ0nf\u000fV")), method3450(method3449("r\bJ2}g\fD9`c\u0017")), method3450(method3449("|\u0001D9fw\u000bK.Pd\u000f")), method3450(method3449("`\rH8}v\u0005W\u0002kq\u0002D(c`")), method3450(method3449("|\u0001D9fw\u000bK.Pd\u0016D$jf")), method3450(method3449("|\rK)Py\u0005U0nf\u000f@/|")), method3450(method3449("g\u0007W2cx\u0006D/")), method3450(method3449("f\u0014\u000b\u001b'")), method3450(method3449("f\u0014\u000b\u001a'")), method3450(method3449("f\u0014\u000b\u001f'"))};
   @OriginalMember(
      owner = "client!rp",
      name = "t",
      descriptor = "Luw;"
   )
   public static class435 field6718 = new class435(36, 3);
   @OriginalMember(
      owner = "client!rp",
      name = "i",
      descriptor = "Lgh;"
   )
   public static class572 field6720 = new class572(108, 16);
   @OriginalMember(
      owner = "client!rp",
      name = "v",
      descriptor = "[Laf;"
   )
   public static class457[] field6723 = new class457[2048];
   @OriginalMember(
      owner = "client!rp",
      name = "u",
      descriptor = "Lwp;"
   )
   public static class189 field6721;
   @OriginalMember(
      owner = "client!rp",
      name = "w",
      descriptor = "Lwp;"
   )
   public static class189 field6722 = field6721 = new class189(false);
   @OriginalMember(
      owner = "client!rp",
      name = "o",
      descriptor = "I"
   )
   public static int field6709;
   @OriginalMember(
      owner = "client!rp",
      name = "r",
      descriptor = "I"
   )
   public static int field6710;
   @OriginalMember(
      owner = "client!rp",
      name = "m",
      descriptor = "I"
   )
   public static int field6711;
   @OriginalMember(
      owner = "client!rp",
      name = "q",
      descriptor = "I"
   )
   public static int field6712;
   @OriginalMember(
      owner = "client!rp",
      name = "n",
      descriptor = "I"
   )
   public static int field6713;
   @OriginalMember(
      owner = "client!rp",
      name = "l",
      descriptor = "I"
   )
   public static int field6714;
   @OriginalMember(
      owner = "client!rp",
      name = "k",
      descriptor = "I"
   )
   public static int field6715;
   @OriginalMember(
      owner = "client!rp",
      name = "s",
      descriptor = "I"
   )
   public static int field6716;
   @OriginalMember(
      owner = "client!rp",
      name = "x",
      descriptor = "I"
   )
   public static int field6717;
   @OriginalMember(
      owner = "client!rp",
      name = "p",
      descriptor = "I"
   )
   public static int field6719;
   @OriginalMember(
      owner = "client!rp",
      name = "j",
      descriptor = "I"
   )
   public static int field6724;

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method3441(byte arg0) {
      try {
         if (arg0 >= -127) {
            return true;
         } else {
            ++field6714;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6725[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(CI)Z"
   )
   public static final boolean method3442(char arg0, int arg1) {
      try {
         int var2 = -75 / ((arg1 - 34) / 44);
         ++field6711;
         return ~arg0 <= -66 && ~arg0 >= -91 || ~arg0 <= -98 && ~arg0 >= -123;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6725[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "<init>",
      descriptor = "(Lob;)V"
   )
   public class458(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!rp",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method51(int arg0) {
      try {
         if (this.method3445(false)) {
            if (super.field4914.field11145.method2093((byte)-127) && !class331.method2566(-3009, super.field4914.field11145.method2098(false))) {
               super.field4913 = 1;
            }

            if (super.field4914.field11172.method2680(false) == 1) {
               super.field4913 = 1;
            }
         }

         ++field6709;
         if (arg0 != 0) {
            field6721 = null;
         }

         if (super.field4913 == 3) {
            super.field4913 = 2;
         }

         if (~super.field4913 > -1 || super.field4913 > 3) {
            super.field4913 = this.method53(false);
         }

      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6725[28] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3443(int arg0) {
      try {
         field6723 = null;
         field6721 = null;
         if (arg0 == 3641) {
            field6722 = null;
            field6718 = null;
            field6720 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6725[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(BLrfa;)I"
   )
   public static final int method3444(byte arg0, class209 arg1) {
      try {
         if (arg0 != -108) {
            return 64;
         } else {
            ++field6712;
            if (class209.field3099 == arg1) {
               return 5120;
            } else if (class209.field3102 != arg1) {
               if (class209.field3105 != arg1) {
                  if (class209.field3106 == arg1) {
                     return 5121;
                  } else if (class209.field3107 == arg1) {
                     return 5123;
                  } else if (class209.field3108 != arg1) {
                     if (class209.field3109 != arg1) {
                        if (class209.field3110 == arg1) {
                           return 5126;
                        } else {
                           throw new IllegalArgumentException("");
                        }
                     } else {
                        return 5131;
                     }
                  } else {
                     return 5125;
                  }
               } else {
                  return 5124;
               }
            } else {
               return 5122;
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6725[3] + arg0 + ',' + (arg1 != null ? field6725[1] : field6725[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "c",
      descriptor = "(Z)Z"
   )
   public final boolean method3445(boolean arg0) {
      try {
         if (arg0) {
            field6720 = null;
         }

         ++field6719;
         return class201.method1725(super.field4913, 8);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6725[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            return -123;
         } else {
            ++field6724;
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6725[27] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field6717;
         if (class201.method1725(arg1, 8)) {
            if (super.field4914.field11145.method2093((byte)-127) && !class331.method2566(-3009, super.field4914.field11145.method2098(false))) {
               return 3;
            }

            if (~super.field4914.field11172.method2680(false) == -2) {
               return 3;
            }
         }

         if (arg0 > -45) {
            return 42;
         } else if (~arg1 == -4) {
            return 3;
         } else {
            return class201.method1725(arg1, 8) ? 2 : 1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6725[29] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(Lhu;B)V"
   )
   public static final void method3446(class142 param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method54(int arg0, byte arg1) {
      try {
         if (arg1 > 99) {
            super.field4913 = arg0;
            ++field6713;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6725[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(Lhw;I)V"
   )
   public static final void method3447(class141 arg0, int arg1) {
      try {
         class233.field3404 = arg0.method1329(-1, field6725[20]);
         ++field6715;
         class615.field8945 = arg0.method1329(arg1 ^ -31628, field6725[12]);
         class638.field9307 = arg0.method1329(-1, field6725[23]);
         class219.field3304 = arg0.method1329(-1, field6725[22]);
         class452.field6610 = arg0.method1329(-1, field6725[24]);
         class511.field7462 = arg0.method1329(-1, field6725[14]);
         class397.field5846 = arg0.method1329(-1, field6725[25]);
         class412.field6032 = arg0.method1329(-1, field6725[10]);
         class88.field1437 = arg0.method1329(-1, field6725[15]);
         class782.field11451 = arg0.method1329(arg1 ^ -31628, field6725[16]);
         class238.field3455 = arg0.method1329(-1, field6725[26]);
         if (arg1 == 31627) {
            class171.field2653 = arg0.method1329(-1, field6725[13]);
            class116.field1899 = arg0.method1329(arg1 + -31628, field6725[21]);
            class220.field3318 = arg0.method1329(arg1 ^ -31628, field6725[11]);
            class538.field7831 = arg0.method1329(-1, field6725[17]);
            class15.field213 = arg0.method1329(-1, field6725[19]);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6725[18] + (arg0 != null ? field6725[1] : field6725[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "<init>",
      descriptor = "(ILob;)V"
   )
   public class458(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!rp",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method3448(boolean arg0) {
      try {
         ++field6710;
         return arg0 ? -117 : super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6725[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3449(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3450(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
