import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class345 extends class557 {
   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5086 = new String[]{method2745(method2744("oq\fQh")), method2745(method2744("k}")), method2745(method2744("oq\fZh")), method2745(method2744("oq\f]h")), method2745(method2744("oq\fSh")), method2745(method2744("oq\f_h")), method2745(method2744("liNw")), method2745(method2744("y2\f5=")), method2745(method2744("oq\fYh")), method2745(method2744("oq\f\\h")), method2745(method2744("oq\fXh")), method2745(method2744("oq\f^h"))};
   @OriginalMember(
      owner = "client!mm",
      name = "l",
      descriptor = "I"
   )
   public static int field5076;
   @OriginalMember(
      owner = "client!mm",
      name = "m",
      descriptor = "I"
   )
   public static int field5077;
   @OriginalMember(
      owner = "client!mm",
      name = "p",
      descriptor = "I"
   )
   public static int field5078;
   @OriginalMember(
      owner = "client!mm",
      name = "j",
      descriptor = "I"
   )
   public static int field5079;
   @OriginalMember(
      owner = "client!mm",
      name = "k",
      descriptor = "I"
   )
   public static int field5080;
   @OriginalMember(
      owner = "client!mm",
      name = "o",
      descriptor = "I"
   )
   public static int field5081;
   @OriginalMember(
      owner = "client!mm",
      name = "q",
      descriptor = "I"
   )
   public static int field5082;
   @OriginalMember(
      owner = "client!mm",
      name = "n",
      descriptor = "I"
   )
   public static int field5083;
   @OriginalMember(
      owner = "client!mm",
      name = "h",
      descriptor = "I"
   )
   public static int field5084;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!mm",
      name = "i",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field5085;

   @OriginalMember(
      owner = "client!mm",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            this.method99(83, true);
         }

         ++field5078;
         return 1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5086[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(Ljava/awt/Frame;ILfea;)V"
   )
   public static final void method2738(Frame arg0, int arg1, class82 arg2) {
      boolean var3 = client.field10022;

      try {
         ++field5079;

         label49:
         do {
            class92 var4 = arg2.method880((byte)92, arg0);
            if (var3) {
               class97.method968(32353, 10L);
            }

            while(true) {
               int var10000;
               if (var4.field1526 != 0) {
                  var10000 = var4.field1526;
                  if (!var3) {
                     if (var10000 == 1) {
                        break label49;
                     }

                     class97.method968(32353, 100L);
                     break;
                  }
               } else {
                  var10000 = 32353;
               }

               class97.method968(var10000, 10L);
            }
         } while(!var3);

         arg0.setVisible(false);
         int var5 = 39 / ((arg1 - 48) / 51);
         arg0.dispose();
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5086[8] + (arg0 != null ? field5086[7] : field5086[6]) + ',' + arg1 + ',' + (arg2 != null ? field5086[7] : field5086[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public static final boolean method2739(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field5076;
         boolean var4 = true;
         if (arg0 != 3) {
            return true;
         } else {
            class338 var5 = (class338)class421.method3284(arg3, arg1, arg2);
            if (var5 != null) {
               var4 &= class181.method1640(var5, (byte)90);
            }

            class338 var6 = (class338)class331.method2653(arg3, arg1, arg2, field5085 != null ? field5085 : (field5085 = method2743(field5086[1])));
            if (var6 != null) {
               var4 &= class181.method1640(var6, (byte)90);
            }

            class338 var7 = (class338)class495.method3755(arg3, arg1, arg2);
            if (var7 != null) {
               var4 &= class181.method1640(var7, (byte)90);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field5086[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method2740(int arg0) {
      try {
         if (arg0 >= -52) {
            return -38;
         } else {
            ++field5083;
            return super.field7905;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5086[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (arg0 == -22) {
            label29: {
               if (super.field7906.method4715((byte)-107) != class648.field9162) {
                  super.field7905 = 1;
                  if (!client.field10022) {
                     break label29;
                  }
               }

               if (super.field7906.method4710(arg0 + 37)) {
                  super.field7905 = 0;
               }
            }

            ++field5080;
            if (super.field7905 != 0 && ~super.field7905 != -2) {
               super.field7905 = this.method97(0);
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5086[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class345(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!mm",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class345(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field5084;
         if (super.field7906.method4715((byte)-107) == class648.field9162) {
            if (super.field7906.method4710(74)) {
               return 3;
            } else {
               return ~arg1 != -1 && super.field7906.field9119.method5500(-78) != 1 ? 2 : 1;
            }
         } else {
            if (arg0 != 1) {
               this.method97(-67);
            }

            return 3;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5086[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         super.field7905 = arg0;
         if (arg1) {
            ++field5077;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5086[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method2741(int arg0) {
      try {
         ++field5081;
         int var1 = arg0;
         if (~class476.field6870.field9128.method2605(-59) == -2) {
            int var2 = arg0 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
         }

         if (class476.field6870.field9138.method2740(-62) == 0) {
            var1 |= 64;
         }

         class471.method3609(false, var1);
         class549.field7834.method3847(var1, (byte)39);
         class201.field2882.method5579(var1, (byte)99);
         class478.field6879.method4875(-30192, var1);
         class183.field2689.method3227(19209, var1);
         class128.method1308(var1, arg0 ^ 9106);
         class367.method2893((byte)100, var1);
         class545.method4087(false, var1);
         class671.method4864(var1, (byte)-71);
         class411.method3213((byte)-128);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5086[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method2742(byte arg0) {
      try {
         ++field5082;
         if (super.field7906.method4715((byte)-107) == class648.field9162) {
            return !super.field7906.method4710(arg0 ^ -28);
         } else {
            return arg0 != 108 ? false : false;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5086[4] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2743(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2744(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2745(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
