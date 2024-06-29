import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class111 extends class96 {
   @OriginalMember(
      owner = "client!gfa",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1743 = new String[]{method1089(method1088("`\u000b\n9s/")), method1089(method1088("`\u000b\n9u/")), method1089(method1088("`\u000b\n9t/")), method1089(method1088("`\u000b\n9r/")), method1089(method1088("`\u000b\n9q/")), method1089(method1088("`\u000b\n9\fn\u0003\u0002c\u000e/")), method1089(method1088("`\u000b\n9v/"))};
   @OriginalMember(
      owner = "client!gfa",
      name = "w",
      descriptor = "I"
   )
   public static int field1737 = 765;
   @OriginalMember(
      owner = "client!gfa",
      name = "B",
      descriptor = "I"
   )
   public static int field1731 = 999999;
   @OriginalMember(
      owner = "client!gfa",
      name = "s",
      descriptor = "I"
   )
   public int field1732;
   @OriginalMember(
      owner = "client!gfa",
      name = "x",
      descriptor = "I"
   )
   public static int field1733;
   @OriginalMember(
      owner = "client!gfa",
      name = "t",
      descriptor = "I"
   )
   public static int field1734;
   @OriginalMember(
      owner = "client!gfa",
      name = "y",
      descriptor = "I"
   )
   public static int field1735;
   @OriginalMember(
      owner = "client!gfa",
      name = "u",
      descriptor = "I"
   )
   public static int field1738;
   @OriginalMember(
      owner = "client!gfa",
      name = "v",
      descriptor = "I"
   )
   public int field1739;
   @OriginalMember(
      owner = "client!gfa",
      name = "r",
      descriptor = "I"
   )
   public int field1740;
   @OriginalMember(
      owner = "client!gfa",
      name = "A",
      descriptor = "I"
   )
   public static int field1741;
   @OriginalMember(
      owner = "client!gfa",
      name = "q",
      descriptor = "I"
   )
   public static int field1742;
   @OriginalMember(
      owner = "client!gfa",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   public String field1736;

   @OriginalMember(
      owner = "client!gfa",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method1082(int arg0) {
      try {
         ++field1741;
         if (~class784.field11423 > -1) {
            class784.field11423 = 0;
            class348.field5114 = -1;
            class644.field9063 = -1;
         }

         if (class651.field9225 < class784.field11423) {
            class784.field11423 = class651.field9225;
            class644.field9063 = -1;
            class348.field5114 = -1;
         }

         if (class535.field7521 < arg0) {
            class644.field9063 = -1;
            class348.field5114 = -1;
            class535.field7521 = 0;
         }

         if (class535.field7521 > class651.field9235) {
            class644.field9063 = -1;
            class348.field5114 = -1;
            class535.field7521 = class651.field9235;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1743[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1083(int arg0) {
      try {
         super.field1548 = super.field1548 & Long.MIN_VALUE | class604.method4452(-124) + 500L;
         if (arg0 >= -13) {
            this.field1739 = -65;
         }

         ++field1733;
         class37.field541.method5224(this, 91);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1743[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "b",
      descriptor = "(Z)J"
   )
   public final long method1084(boolean arg0) {
      try {
         if (!arg0) {
            field1731 = -70;
         }

         ++field1735;
         return 72057594037927935L & super.field3777;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1743[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method1085(byte arg0) {
      try {
         ++field1738;
         return arg0 <= 28 ? -59 : (int)(255L & super.field3777 >>> 56);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1743[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "c",
      descriptor = "(B)J"
   )
   public final long method1086(byte arg0) {
      try {
         if (arg0 != 110) {
            field1731 = -49;
         }

         ++field1742;
         return Long.MAX_VALUE & super.field1548;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1743[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method1087(int arg0) {
      try {
         ++field1734;
         super.field1548 |= Long.MIN_VALUE;
         if (this.method1086((byte)110) == (long)arg0) {
            class236.field3650.method5224(this, 64);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1743[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "<init>",
      descriptor = "(IJ)V"
   )
   public class111(int arg0, long arg1) {
      try {
         super.field3777 = arg1 | (long)arg0 << 56;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1743[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1088(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1089(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
