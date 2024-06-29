import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public abstract class class224 extends class428 {
   @OriginalMember(
      owner = "client!su",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3198 = new String[]{method1758(method1757("u\u0006\u00067\b")), method1758(method1757("n\u0015")), method1758(method1757("u\u0006\u00066\b"))};
   @OriginalMember(
      owner = "client!su",
      name = "p",
      descriptor = "I"
   )
   public static int field3189 = -1;
   @OriginalMember(
      owner = "client!su",
      name = "n",
      descriptor = "I"
   )
   public static int field3193 = 0;
   @OriginalMember(
      owner = "client!su",
      name = "m",
      descriptor = "I"
   )
   public static int field3195 = 0;
   @OriginalMember(
      owner = "client!su",
      name = "o",
      descriptor = "I"
   )
   public static int field3188;
   @OriginalMember(
      owner = "client!su",
      name = "v",
      descriptor = "I"
   )
   public static int field3190;
   @OriginalMember(
      owner = "client!su",
      name = "u",
      descriptor = "I"
   )
   public static int field3191;
   @OriginalMember(
      owner = "client!su",
      name = "q",
      descriptor = "I"
   )
   public int field3192;
   @OriginalMember(
      owner = "client!su",
      name = "r",
      descriptor = "I"
   )
   public static int field3194;
   @OriginalMember(
      owner = "client!su",
      name = "s",
      descriptor = "I"
   )
   public int field3197;
   @OriginalMember(
      owner = "client!su",
      name = "t",
      descriptor = "[I"
   )
   public int[] field3196;

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(Ljava/awt/Graphics;IIIIIII)V"
   )
   public abstract void method1700(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(BIILjava/awt/Canvas;)V"
   )
   public abstract void method1698(byte arg0, int arg1, int arg2, Canvas arg3);

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(Lgn;)V"
   )
   public static final void method1754(class731 arg0) {
      class80.field1038.method551(arg0.field10694, arg0.field10697 + (arg0.method232(-96) >> 1), arg0.field10693, class752.field11119);
      arg0.field10692 = class752.field11119[0];
      arg0.field10699 = class752.field11119[1];
      arg0.field10707 = class752.field11119[2];
   }

   @OriginalMember(
      owner = "client!su",
      name = "b",
      descriptor = "(I)Lvja;"
   )
   public static final class290 method1755(int arg0) {
      try {
         ++field3194;

         try {
            return arg0 != 32258 ? null : (class290)Class.forName(field3198[1]).newInstance();
         } catch (Throwable var2) {
            return new class47();
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3198[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1756(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!su",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1757(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!su",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1758(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
