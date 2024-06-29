import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class81 extends class708 implements class499 {
   @OriginalMember(
      owner = "client!gea",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1021 = new String[]{method796(method795("\r>\u0000q>B")), method796(method795("\r>\u0000q3B")), method796(method795("\r>\u0000q=B")), method796(method795("\r>\u0000q?B")), method796(method795("\u0011uOq\u0004")), method796(method795("\u0004.\r3")), method796(method795("\r>\u0000q:B")), method796(method795("\r>\u0000q0B")), method796(method795("\r>\u0000q<B")), method796(method795("\r>\u0000q1B")), method796(method795("\r>\u0000q;B"))};
   @OriginalMember(
      owner = "client!gea",
      name = "y",
      descriptor = "Z"
   )
   public static boolean field1014 = false;
   @OriginalMember(
      owner = "client!gea",
      name = "A",
      descriptor = "Lbga;"
   )
   public static class378 field1013 = new class378(101, 1);
   @OriginalMember(
      owner = "client!gea",
      name = "C",
      descriptor = "B"
   )
   private byte field1017;
   @OriginalMember(
      owner = "client!gea",
      name = "x",
      descriptor = "I"
   )
   public static int field1010;
   @OriginalMember(
      owner = "client!gea",
      name = "F",
      descriptor = "I"
   )
   public static int field1011;
   @OriginalMember(
      owner = "client!gea",
      name = "D",
      descriptor = "I"
   )
   public static int field1012;
   @OriginalMember(
      owner = "client!gea",
      name = "H",
      descriptor = "I"
   )
   public static int field1015;
   @OriginalMember(
      owner = "client!gea",
      name = "z",
      descriptor = "I"
   )
   public static int field1016;
   @OriginalMember(
      owner = "client!gea",
      name = "B",
      descriptor = "I"
   )
   public static int field1018;
   @OriginalMember(
      owner = "client!gea",
      name = "E",
      descriptor = "I"
   )
   public static int field1019;
   @OriginalMember(
      owner = "client!gea",
      name = "G",
      descriptor = "I"
   )
   public static int field1020;

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(IZ)Ljaclib/memory/Buffer;"
   )
   public final Buffer method786(int arg0, boolean arg1) {
      try {
         ++field1011;
         if (arg0 != -9609) {
            this.method788((byte)74);
         }

         return super.method5153(arg0 ^ 9623, super.field10281.field8940, arg1);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1021[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method787(byte arg0) {
      try {
         if (arg0 != 108) {
            field1013 = null;
         }

         ++field1016;
         return super.method5154(0, super.field10281.field8940);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1021[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method788(byte arg0) {
      try {
         ++field1010;
         super.method788((byte)120);
         if (arg0 <= 21) {
            this.method792(-88, true, -69, (Source)null);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1021[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method789(int arg0, int arg1, int arg2) {
      try {
         ++field1012;
         if (arg0 != -6222) {
            this.field1017 = 41;
         }

         this.field1017 = (byte)arg2;
         super.method895((byte)103, arg1);
         return true;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1021[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method790(boolean arg0) {
      try {
         ++field1015;
         if (arg0) {
            field1013 = null;
         }

         return this.field1017;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1021[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "<init>",
      descriptor = "(Lkfa;Z)V"
   )
   public class81(class632 arg0, boolean arg1) {
      super(arg0, 34962, arg1);
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(Lkn;IIII)V"
   )
   public static final void method791(class774 param0, int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(IZILjaclib/memory/Source;)Z"
   )
   public final boolean method792(int arg0, boolean arg1, int arg2, Source arg3) {
      try {
         this.field1017 = (byte)arg0;
         ++field1019;
         super.method5156(0, arg2, arg3);
         if (arg1) {
            method793(92);
         }

         return true;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1021[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1021[4] : field1021[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method793(int arg0) {
      try {
         field1013 = null;
         if (arg0 >= -22) {
            method791((class774)null, 64, 27, 44, -92);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1021[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method794(int arg0) {
      try {
         ++field1020;
         return arg0 != 1143968105 ? 118 : super.method794(arg0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1021[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method795(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method796(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
