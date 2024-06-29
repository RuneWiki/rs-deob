import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class129 extends class743 {
   @OriginalMember(
      owner = "client!jfa",
      name = "u",
      descriptor = "I"
   )
   private int field1654;
   @OriginalMember(
      owner = "client!jfa",
      name = "x",
      descriptor = "I"
   )
   private int field1649;
   @OriginalMember(
      owner = "client!jfa",
      name = "s",
      descriptor = "I"
   )
   private int field1657;
   @OriginalMember(
      owner = "client!jfa",
      name = "t",
      descriptor = "I"
   )
   private int field1648;
   @OriginalMember(
      owner = "client!jfa",
      name = "v",
      descriptor = "I"
   )
   private int field1659;
   @OriginalMember(
      owner = "client!jfa",
      name = "r",
      descriptor = "I"
   )
   private int field1652;
   @OriginalMember(
      owner = "client!jfa",
      name = "n",
      descriptor = "Liu;"
   )
   private class530 field1650;
   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1660 = new String[]{method1102(method1101("6\"e\u001b")), method1102(method1101("21hY$19`\u0003&p")), method1102(method1101("#y'Ye")), method1102(method1101("21hY[p")), method1102(method1101("21hYYp")), method1102(method1101("21hYZp"))};
   @OriginalMember(
      owner = "client!jfa",
      name = "p",
      descriptor = "I"
   )
   public static int field1653;
   @OriginalMember(
      owner = "client!jfa",
      name = "w",
      descriptor = "I"
   )
   public static int field1655;
   @OriginalMember(
      owner = "client!jfa",
      name = "q",
      descriptor = "I"
   )
   public static int field1656;
   @OriginalMember(
      owner = "client!jfa",
      name = "m",
      descriptor = "I"
   )
   public static int field1658;
   @OriginalMember(
      owner = "client!jfa",
      name = "o",
      descriptor = "Lph;"
   )
   private class789 field1651;

   @OriginalMember(
      owner = "client!jfa",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method1098(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(ILmn;Z)V"
   )
   public static final void method1099(int arg0, class238 arg1, boolean arg2) {
      try {
         ++field1658;
         if (class128.field1640 < 50) {
            if (arg1 != null && arg1.field3032 != null && ~arg0 > ~arg1.field3032.length && arg1.field3032[arg0] != null) {
               if (arg2) {
                  method1098((byte)-83);
               }

               int var3 = arg1.field3032[arg0][0];
               int var4 = var3 >> 8;
               if (arg1.field3032[arg0].length > 1) {
                  int var5 = (int)(Math.random() * (double)arg1.field3032[arg0].length);
                  if (~var5 < -1) {
                     var4 = arg1.field3032[arg0][var5];
                  }
               }

               int var6 = (var3 & 252) >> 5;
               int var7 = 256;
               if (arg1.field3028 != null && arg1.field3017 != null) {
                  var7 = class731.method5284(-96, arg1.field3028[arg0], arg1.field3017[arg0]);
               }

               if (!arg1.field3005) {
                  class43.method322(255, var4, 0, 0, var6, var7);
               } else {
                  class679.method4953(var6, false, 255, var7, (byte)23, 0, var4);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field1660[4] + arg0 + ',' + (arg1 != null ? field1660[2] : field1660[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(I)Lph;"
   )
   public final class789 method1100(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field1653;
         if (this.field1651 == null) {
            class102 var3;
            byte var4;
            int var5;
            int var9;
            label89: {
               class679.field10006[4] = this.field1657;
               class679.field10006[5] = this.field1659;
               class679.field10006[2] = this.field1654;
               var3 = this.field1650.field6667;
               class679.field10006[3] = this.field1648;
               class679.field10006[0] = this.field1649;
               class679.field10006[1] = this.field1652;
               var4 = 0;
               var5 = 0;
               int var6 = 0;
               if (var2) {
                  if (!var3.method915(class679.field10006[var6], arg0 + -20214)) {
                     return null;
                  }
               } else if (var6 >= 6) {
                  var9 = 0;
                  if (!var2) {
                     break label89;
                  }
               } else if (!var3.method915(class679.field10006[var6], arg0 + -20214)) {
                  return null;
               }

               while(true) {
                  class668 var7 = var3.method911(class679.field10006[var6], arg0 + -20245);
                  int var8 = var7.field9901 ? 64 : 128;
                  if (var7.field9900 > 0) {
                     var4 = 1;
                  }

                  if (~var5 > ~var8) {
                     var5 = var8;
                  }

                  ++var6;
                  if (var6 >= 6) {
                     var9 = 0;
                     if (!var2) {
                        break;
                     }
                  } else if (!var3.method915(class679.field10006[var6], arg0 + -20214)) {
                     return null;
                  }
               }
            }

            if (var2) {
               class556.field8152[var9] = var3.method913(var5, class679.field10006[var9], false, 89, 1.0F, var5);
               ++var9;
            }

            while(true) {
               while(var9 < 6) {
                  class556.field8152[var9] = var3.method913(var5, class679.field10006[var9], false, 89, 1.0F, var5);
                  ++var9;
               }

               if (!var2) {
                  this.field1651 = new class789(this.field1650, 6407, var5, ~var4 != -1, class556.field8152);
                  break;
               }

               ++var9;
            }
         }

         return arg0 != 20341 ? null : this.field1651;
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field1660[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "<init>",
      descriptor = "(Liu;IIIIII)V"
   )
   public class129(class530 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field1654 = arg3;
         this.field1649 = arg1;
         this.field1657 = arg5;
         this.field1648 = arg4;
         this.field1659 = arg6;
         this.field1652 = arg2;
         this.field1650 = arg0;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field1660[1] + (arg0 != null ? field1660[2] : field1660[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1101(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1102(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
