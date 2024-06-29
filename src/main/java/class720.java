import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class720 extends class110 implements class145 {
   @OriginalMember(
      owner = "client!rea",
      name = "E",
      descriptor = "I"
   )
   private int field10311;
   @OriginalMember(
      owner = "client!rea",
      name = "y",
      descriptor = "I"
   )
   private int field10313;
   @OriginalMember(
      owner = "client!rea",
      name = "x",
      descriptor = "I"
   )
   private int field10312;
   @OriginalMember(
      owner = "client!rea",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10320 = new String[]{method5218(method5217("'\"5\u0004,<)=^.}")), method5218(method5217(";28F")), method5218(method5217(".iz\u0004m")), method5218(method5217("'\"5\u0004S}")), method5218(method5217("'\"5\u0004Q}")), method5218(method5217("'\"5\u0004R}"))};
   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field10314 = new String[5];
   @OriginalMember(
      owner = "client!rea",
      name = "A",
      descriptor = "Lhha;"
   )
   public static class724 field10316 = new class724(75, 4);
   @OriginalMember(
      owner = "client!rea",
      name = "B",
      descriptor = "I"
   )
   public static int field10310;
   @OriginalMember(
      owner = "client!rea",
      name = "F",
      descriptor = "I"
   )
   public static int field10317;
   @OriginalMember(
      owner = "client!rea",
      name = "C",
      descriptor = "Lha;"
   )
   public static class17 field10315;
   @OriginalMember(
      owner = "client!rea",
      name = "D",
      descriptor = "Lfea;"
   )
   public static class82 field10318;
   @OriginalMember(
      owner = "client!rea",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field10319;

   @OriginalMember(
      owner = "client!rea",
      name = "<init>",
      descriptor = "(Lqs;Lsr;III[B)V"
   )
   public class720(class771 arg0, class78 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      super(arg0, 32879, arg1, class779.field11371, arg2 * arg3 * arg4, false);

      try {
         this.field10311 = arg2;
         this.field10313 = arg3;
         this.field10312 = arg4;
         super.field1715.method1943(0, this);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage3Dub(super.field1719, 0, this.method1073(-2), this.field10311, this.field10313, this.field10312, 0, class186.method1672((byte)-75, super.field1720), 5121, arg5, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10320[0] + (arg0 != null ? field10320[2] : field10320[1]) + ',' + (arg1 != null ? field10320[2] : field10320[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10320[2] : field10320[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method5214(int arg0) {
      try {
         if (arg0 != 6776) {
            field10319 = null;
         }

         field10315 = null;
         field10314 = null;
         field10316 = null;
         field10319 = null;
         field10318 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10320[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5215(byte arg0) {
      try {
         ++field10310;
         class111 var1 = class796.method5734(15, 0L, (byte)-124);
         var1.method1083(-111);
         if (arg0 >= -4) {
            field10314 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10320[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(Laka;Lka;Laka;Z)V"
   )
   public static final void method5216(class258 arg0, class761 arg1, class258 arg2, boolean arg3) {
      try {
         if (arg0.method2216(1024) && arg2.method2216(1024)) {
            class33 var4 = arg0.field3923;
            class33 var5 = arg2.field3923;
            arg1.method5489(var5.field479 | var4.field479, arg0.field3948, var5.field477[arg2.field3941], var4.field466, arg2.field3948, arg2.field3957, arg2.field3937, arg0.field3947, arg2.field3947, arg0.field3957, (byte)-62, arg2.field3950, arg0.field3937, var4.field477[arg0.field3941], arg0.field3950);
         }

         if (arg3) {
            ++field10317;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field10320[3] + (arg0 != null ? field10320[2] : field10320[1]) + ',' + (arg1 != null ? field10320[2] : field10320[1]) + ',' + (arg2 != null ? field10320[2] : field10320[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5217(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5218(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
