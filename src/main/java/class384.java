import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oka")
public class class384 {
   @OriginalMember(
      owner = "client!oka",
      name = "e",
      descriptor = "[I"
   )
   private int[] field5573;
   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "[I"
   )
   private int[] field5572;
   @OriginalMember(
      owner = "client!oka",
      name = "w",
      descriptor = "[[Loea;"
   )
   private class624[][] field5570;
   @OriginalMember(
      owner = "client!oka",
      name = "i",
      descriptor = "I"
   )
   private int field5576;
   @OriginalMember(
      owner = "client!oka",
      name = "s",
      descriptor = "[I"
   )
   private int[] field5579;
   @OriginalMember(
      owner = "client!oka",
      name = "d",
      descriptor = "[[Loea;"
   )
   private class624[][] field5592;
   @OriginalMember(
      owner = "client!oka",
      name = "o",
      descriptor = "Lbr;"
   )
   private class418 field5584;
   @OriginalMember(
      owner = "client!oka",
      name = "f",
      descriptor = "Lbk;"
   )
   private class398 field5581;
   @OriginalMember(
      owner = "client!oka",
      name = "n",
      descriptor = "Lbk;"
   )
   private class398 field5577;
   @OriginalMember(
      owner = "client!oka",
      name = "b",
      descriptor = "Llba;"
   )
   private class576 field5575;
   @OriginalMember(
      owner = "client!oka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5593 = new String[]{method2919(method2918("Xgc'\u0014\u001f")), method2919(method2918("Xgc'd^bk}f\u001f")), method2919(method2918("L\",'%")), method2919(method2918("Yyne")), method2919(method2918("Xgc'\u001b\u001f")), method2919(method2918("Xgc'\u001d\u001f")), method2919(method2918("Xgc'\u0012\u001f")), method2919(method2918("Xgc'\u001a\u001f")), method2919(method2918("Xgc'\u0019\u001f")), method2919(method2918("Xgc'\u001c\u001f")), method2919(method2918("Xgc'\u0010\u001f")), method2919(method2918("Xgc'\u0011\u001f")), method2919(method2918("Xgc'\u001e\u001f")), method2919(method2918("Xgc'\u0013\u001f")), method2919(method2918("Xgc'\u001f\u001f"))};
   @OriginalMember(
      owner = "client!oka",
      name = "l",
      descriptor = "Lwu;"
   )
   public static class395 field5583 = new class395(8, 0, 4, 1);
   @OriginalMember(
      owner = "client!oka",
      name = "r",
      descriptor = "D"
   )
   public static double field5591;
   @OriginalMember(
      owner = "client!oka",
      name = "m",
      descriptor = "I"
   )
   public static int field5571;
   @OriginalMember(
      owner = "client!oka",
      name = "q",
      descriptor = "I"
   )
   public static int field5574;
   @OriginalMember(
      owner = "client!oka",
      name = "v",
      descriptor = "I"
   )
   public static int field5578;
   @OriginalMember(
      owner = "client!oka",
      name = "p",
      descriptor = "I"
   )
   public static int field5580;
   @OriginalMember(
      owner = "client!oka",
      name = "u",
      descriptor = "I"
   )
   public static int field5582;
   @OriginalMember(
      owner = "client!oka",
      name = "t",
      descriptor = "I"
   )
   public static int field5585;
   @OriginalMember(
      owner = "client!oka",
      name = "g",
      descriptor = "I"
   )
   public static int field5586;
   @OriginalMember(
      owner = "client!oka",
      name = "h",
      descriptor = "I"
   )
   public static int field5587;
   @OriginalMember(
      owner = "client!oka",
      name = "j",
      descriptor = "I"
   )
   public static int field5588;
   @OriginalMember(
      owner = "client!oka",
      name = "c",
      descriptor = "I"
   )
   public static int field5589;
   @OriginalMember(
      owner = "client!oka",
      name = "k",
      descriptor = "I"
   )
   public static int field5590;

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(Lsc;Lrha;IB)V"
   )
   public final void method2906(class369 param1, class234 param2, int param3, byte param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2907(int arg0, int arg1) {
      try {
         ++field5587;
         if (~class622.field9156 == -8) {
            if (~class542.field7787 == arg0 && ~class444.field6324 == -1) {
               class686.field10122 = arg1;
               class731.method5321(9, (byte)-81);
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5593[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(Lsc;Z)V"
   )
   public final void method2908(class369 arg0, boolean arg1) {
      try {
         ++field5578;
         if (arg1) {
            this.method2908((class369)null, true);
         }

         this.field5581.method1410(786336, 24, 119);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5593[9] + (arg0 != null ? field5593[2] : field5593[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(BILsc;)V"
   )
   private final void method2909(byte arg0, int arg1, class369 arg2) {
      try {
         ++field5571;
         class551.field7900 = arg2.field5255;
         arg2.method2771((float)arg1, false);
         arg2.method2792((byte)-65);
         arg2.method2824(false, (byte)28);
         arg2.method2750(false, (byte)22);
         arg2.method2795((byte)124);
         if (arg0 != 103) {
            this.method2911(-59, (class369)null, -102);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5593[14] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5593[2] : field5593[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2910(byte arg0) {
      try {
         field5583 = null;
         if (arg0 > -103) {
            field5591 = -0.2122656399867286D;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5593[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(ILsc;I)V"
   )
   private final void method2911(int param1, class369 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;B)V"
   )
   public static final void method2912(Canvas arg0, byte arg1) {
      try {
         ++field5574;
         if (arg1 >= -81) {
            method2912((Canvas)null, (byte)100);
         }

         Dimension var2 = arg0.getSize();
         class395.method2991(var2.height, var2.width, 0);
         if (class614.field9025 != 1) {
            class50.field660.method499(arg0, class392.field5678, class236.field3290);
         } else {
            class50.field660.method499(arg0, class752.field11122, class790.field11596);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5593[13] + (arg0 != null ? field5593[2] : field5593[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2913(byte arg0) {
      try {
         if (arg0 > 13) {
            this.field5581.method1412(95);
            ++field5586;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5593[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(ZZI)Ljava/lang/String;"
   )
   public static final String method2914(boolean arg0, boolean arg1, int arg2) {
      try {
         if (!arg1) {
            field5591 = 1.225231581213451D;
         }

         ++field5588;
         return arg0 && arg2 >= 0 ? class76.method692(arg2, 10, -10979, arg0) : Integer.toString(arg2);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5593[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(I)[Lic;"
   )
   public static final class729[] method2915(int arg0) {
      try {
         if (arg0 != -31264) {
            return null;
         } else {
            ++field5589;
            return new class729[]{class608.field8917, class663.field9652, class446.field6343};
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5593[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(ILsc;)V"
   )
   private final void method2916(int arg0, class369 arg1) {
      try {
         if (arg0 != 1600) {
            this.field5570 = null;
         }

         ++field5590;
         arg1.method2750(true, (byte)22);
         arg1.method2824(true, (byte)69);
         if (class551.field7900 != arg1.field5255) {
            arg1.method534(class551.field7900);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5593[6] + arg0 + ',' + (arg1 != null ? field5593[2] : field5593[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(Lsc;I)V"
   )
   private final void method2917(class369 arg0, int arg1) {
      try {
         ++field5585;
         class551.field7900 = arg0.field5255;
         if (arg1 == 13741) {
            arg0.method2803((byte)-118);
            arg0.method2824(false, (byte)32);
            arg0.method2750(false, (byte)22);
            arg0.method2795((byte)125);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5593[12] + (arg0 != null ? field5593[2] : field5593[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "<init>",
      descriptor = "(Lsc;)V"
   )
   public class384(class369 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2918(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2919(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
