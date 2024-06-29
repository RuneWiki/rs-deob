import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class11 extends class557 {
   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field188 = new String[]{method101(method100("6j\u001c\u001ap{")), method101(method100("6j\u001c\u001as{")), method101(method100("6j\u001c\u001a\u007f{")), method101(method100("6j\u001c\u001av{")), method101(method100("=~\u0011X")), method101(method100("(%S\u001aJ")), method101(method100("6j\u001c\u001at{")), method101(method100("6j\u001c\u001au{")), method101(method100("6j\u001c\u001aq{")), method101(method100("6j\u001c\u001a}{")), method101(method100("6j\u001c\u001ar{"))};
   @OriginalMember(
      owner = "client!eaa",
      name = "p",
      descriptor = "Lpf;"
   )
   public static class424 field177 = new class424();
   @OriginalMember(
      owner = "client!eaa",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field179 = false;
   @OriginalMember(
      owner = "client!eaa",
      name = "i",
      descriptor = "I"
   )
   public static int field180 = -1;
   @OriginalMember(
      owner = "client!eaa",
      name = "k",
      descriptor = "Lfm;"
   )
   public static class164 field184 = new class164(40, 2);
   @OriginalMember(
      owner = "client!eaa",
      name = "o",
      descriptor = "I"
   )
   public static int field175;
   @OriginalMember(
      owner = "client!eaa",
      name = "j",
      descriptor = "I"
   )
   public static int field176;
   @OriginalMember(
      owner = "client!eaa",
      name = "q",
      descriptor = "I"
   )
   public static int field178;
   @OriginalMember(
      owner = "client!eaa",
      name = "r",
      descriptor = "I"
   )
   public static int field181;
   @OriginalMember(
      owner = "client!eaa",
      name = "n",
      descriptor = "I"
   )
   public static int field182;
   @OriginalMember(
      owner = "client!eaa",
      name = "h",
      descriptor = "I"
   )
   public static int field183;
   @OriginalMember(
      owner = "client!eaa",
      name = "l",
      descriptor = "I"
   )
   public static int field185;
   @OriginalMember(
      owner = "client!eaa",
      name = "s",
      descriptor = "I"
   )
   public static int field186;
   @OriginalMember(
      owner = "client!eaa",
      name = "t",
      descriptor = "I"
   )
   public static int field187;

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "([IZ[Ljava/lang/String;)V"
   )
   public static final void method91(int[] arg0, boolean arg1, String[] arg2) {
      try {
         if (arg1) {
            field184 = null;
         }

         class733.method5306(arg0, 0, arg2, arg2.length + -1, 113);
         ++field183;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field188[3] + (arg0 != null ? field188[5] : field188[4]) + ',' + arg1 + ',' + (arg2 != null ? field188[5] : field188[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class11(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field185;
         if (arg0 != 1) {
            field186 = -28;
         }

         return !class137.method1385(4175, super.field7906.field9109.method4676(arg0 ^ -116)) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field188[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method93(int arg0) {
      try {
         if (arg0 >= -52) {
            method95((byte)-3);
         }

         ++field176;
         return super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field188[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method94(byte arg0) {
      try {
         if (arg0 != 108) {
            this.method93(2);
         }

         ++field175;
         return class137.method1385(4175, super.field7906.field9109.method4676(-106));
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field188[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method95(byte arg0) {
      try {
         int var1 = 70 / ((arg0 - 3) / 58);
         field177 = null;
         field184 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field188[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(ZLtea;)V"
   )
   public static final void method96(boolean arg0, class272 arg1) {
      boolean var2 = client.field10022;

      try {
         ++field187;
         if (arg1 != null) {
            class594.field8377.method2238(arg1, 13);
            if (!arg0) {
               ++class687.field9909;
               Object var3 = null;
               class211 var6;
               if (!arg1.field4153 && !"".equals(arg1.field4152)) {
                  class211 var10000;
                  long var4;
                  label75: {
                     var4 = arg1.field4155;
                     var6 = (class211)class524.field7418.method3101(-1, var4);
                     if (var2) {
                        var10000 = var6;
                     } else if (var6 == null) {
                        var10000 = var6;
                        if (!var2) {
                           break label75;
                        }
                     } else {
                        var10000 = var6;
                     }

                     label74:
                     while(true) {
                        while(var10000.field3012.equals(arg1.field4152)) {
                           var10000 = var6;
                           if (!var2) {
                              break label74;
                           }
                        }

                        var6 = (class211)class524.field7418.method3103(0);
                        if (var6 == null) {
                           var10000 = var6;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var10000 = var6;
                        }
                     }
                  }

                  if (var10000 == null) {
                     var6 = (class211)class144.field2280.method1041(var4, 8);
                     if (var6 != null && !var6.field3012.equals(arg1.field4152)) {
                        var6 = null;
                     }

                     if (var6 == null) {
                        var6 = new class211(arg1.field4152);
                     }

                     class524.field7418.method3098(var4, var6, -1);
                     ++class444.field6480;
                  }
               } else {
                  var6 = new class211(arg1.field4152);
                  ++class444.field6480;
               }

               if (var6.method1821(arg1, true)) {
                  class465.method3577(18774, var6);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field188[7] + arg0 + ',' + (arg1 != null ? field188[5] : field188[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         ++field178;
         if (arg0 != 0) {
            method95((byte)-28);
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field188[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (super.field7906.field9109.method4679(true) && !class137.method1385(4175, super.field7906.field9109.method4676(-105))) {
            super.field7905 = 0;
         }

         if (arg0 != -22) {
            field177 = null;
         }

         ++field181;
         if (~super.field7905 > -1 || super.field7905 > 1) {
            super.field7905 = this.method97(0);
         }

      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field188[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            field179 = false;
         }

         ++field182;
         super.field7905 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field188[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class11(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method100(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method101(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
