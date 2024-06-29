import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class48 extends class247 {
   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "I"
   )
   public int field732 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!ci",
      name = "t",
      descriptor = "I"
   )
   public int field731 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!ci",
      name = "r",
      descriptor = "I"
   )
   public int field730 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!ci",
      name = "k",
      descriptor = "I"
   )
   public int field738 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!ci",
      name = "l",
      descriptor = "I"
   )
   public int field734 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!ci",
      name = "j",
      descriptor = "I"
   )
   public int field737 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!ci",
      name = "y",
      descriptor = "I"
   )
   public int field742 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!ci",
      name = "m",
      descriptor = "I"
   )
   public int field743 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!ci",
      name = "v",
      descriptor = "Lju;"
   )
   public class270 field744;
   @OriginalMember(
      owner = "client!ci",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field746 = new String[]{method538(method537("m\u000eF\u000bw")), method538(method537("uIFf\"")), method538(method537("`\u0012\u0004$")), method538(method537("m\u000eF\fw")), method538(method537("m\u000eF\tw")), method538(method537("m\u000eFt6`\u000e\u001cvw")), method538(method537("m\u000eF\nw")), method538(method537("m\u000eF\rw")), method538(method537("m\u000eF\u000ew"))};
   @OriginalMember(
      owner = "client!ci",
      name = "s",
      descriptor = "Lhha;"
   )
   public static class724 field739 = new class724(121, 2);
   @OriginalMember(
      owner = "client!ci",
      name = "p",
      descriptor = "I"
   )
   public static int field729;
   @OriginalMember(
      owner = "client!ci",
      name = "o",
      descriptor = "I"
   )
   public static int field733;
   @OriginalMember(
      owner = "client!ci",
      name = "u",
      descriptor = "I"
   )
   public static int field735;
   @OriginalMember(
      owner = "client!ci",
      name = "w",
      descriptor = "I"
   )
   public static int field736;
   @OriginalMember(
      owner = "client!ci",
      name = "x",
      descriptor = "I"
   )
   public static int field740;
   @OriginalMember(
      owner = "client!ci",
      name = "n",
      descriptor = "I"
   )
   public static int field741;
   @OriginalMember(
      owner = "client!ci",
      name = "q",
      descriptor = "I"
   )
   public static int field745;

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(BLjga;II)V"
   )
   public static final void method531(byte arg0, class91 arg1, int arg2, int arg3) {
      try {
         class273.field4169 = arg1;
         ++field740;
         if (arg0 > -95) {
            field739 = null;
         }

         class674.field9448 = arg3;
         class511.field7260 = arg2;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field746[0] + arg0 + ',' + (arg1 != null ? field746[1] : field746[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method532(int arg0) {
      try {
         class315.field4719 = new class91[class558.field7924.method454(100)][];
         ++field745;
         if (arg0 == Integer.MIN_VALUE) {
            class779.field11377 = new class91[class558.field7924.method454(100)][];
            class14.field203 = new boolean[class558.field7924.method454(100)];
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field746[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method533(byte arg0) {
      try {
         if (arg0 >= -86) {
            method535((class17)null, 102, 87, (class261)null, 66);
         }

         field739 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field746[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method534(int arg0, int arg1, int arg2) {
      try {
         if (arg1 >= -117) {
            method536(11, (byte)-49);
         }

         ++field736;
         if (arg2 >= this.field731 && ~arg2 >= ~this.field738 && ~arg0 <= ~this.field734 && ~this.field732 <= ~arg0) {
            return true;
         } else {
            return arg2 >= this.field743 && this.field737 >= arg2 && arg0 >= this.field742 && this.field730 >= arg0;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field746[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(Lha;IILsb;I)V"
   )
   public static final void method535(class17 arg0, int arg1, int arg2, class261 arg3, int arg4) {
      boolean var5 = client.field10022;

      try {
         ++field733;
         class418.field6115.method2237(54);
         if (!class732.field10406) {
            class270 var6 = (class270)arg3.method2245((byte)-94);
            if (!var5 && var6 == null) {
               if (arg1 != -9297) {
                  field729 = -68;
               }
            } else {
               do {
                  class541 var7 = class651.field9200.method1756(36, var6.field4134);
                  if (class669.method4853(-1, var7)) {
                     boolean var8 = class136.method1381(90, arg4, arg0, var7, arg2, var6);
                     if (var8) {
                        class650.method4740(-52, arg0, var6, var7);
                     }
                  }

                  var6 = (class270)arg3.method2239((byte)94);
               } while(var6 != null);

               if (arg1 != -9297) {
                  field729 = -68;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field746[7] + (arg0 != null ? field746[1] : field746[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field746[1] : field746[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method536(int arg0, byte arg1) {
      try {
         ++field741;
         if (class724.field10354 != null) {
            if (~arg0 <= -1 && arg0 < class724.field10354.field5329) {
               class622 var2 = class724.field10354.field5311[arg0];
               if (~var2.field8883 == 0) {
                  class242 var3 = class735.method5318(-116);
                  class381 var4 = class801.method5775(class696.field10051, 0, var3.field3718);
                  var4.field5570.method656((byte)50, class519.method3880(false, var2.field8891) + 2);
                  var4.field5570.method653(arg0, -90);
                  var4.field5570.method658(var2.field8891, -127);
                  if (arg1 >= -51) {
                     method531((byte)125, (class91)null, -111, 40);
                  }

                  var3.method2111(14024, var4);
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field746[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "<init>",
      descriptor = "(Lju;)V"
   )
   public class48(class270 arg0) {
      try {
         this.field744 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field746[5] + (arg0 != null ? field746[1] : field746[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method537(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method538(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
