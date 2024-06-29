import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class583 extends class795 {
   @OriginalMember(
      owner = "client!kga",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8612 = new String[]{method4360(method4359("ebO(9&")), method4360(method4359("ebO(=&")), method4360(method4359("ebO(>&")), method4360(method4359("ebO(8&")), method4360(method4359("ebO(?&"))};
   @OriginalMember(
      owner = "client!kga",
      name = "B",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8610 = null;
   @OriginalMember(
      owner = "client!kga",
      name = "I",
      descriptor = "I"
   )
   public static int field8603;
   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "I"
   )
   public int field8605;
   @OriginalMember(
      owner = "client!kga",
      name = "A",
      descriptor = "I"
   )
   public static int field8607;
   @OriginalMember(
      owner = "client!kga",
      name = "G",
      descriptor = "I"
   )
   public static int field8608;
   @OriginalMember(
      owner = "client!kga",
      name = "E",
      descriptor = "I"
   )
   public static int field8609;
   @OriginalMember(
      owner = "client!kga",
      name = "H",
      descriptor = "Lhd;"
   )
   public class347 field8606;
   @OriginalMember(
      owner = "client!kga",
      name = "F",
      descriptor = "Llia;"
   )
   public static class633 field8611;
   @OriginalMember(
      owner = "client!kga",
      name = "D",
      descriptor = "[B"
   )
   public byte[] field8604;

   @OriginalMember(
      owner = "client!kga",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4354(int arg0) {
      try {
         ++field8609;
         if (super.field11623) {
            return 0;
         } else {
            if (arg0 < 63) {
               method4357((byte)-102);
            }

            return 100;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8612[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "i",
      descriptor = "(I)I"
   )
   public static final int method4355(int arg0) {
      try {
         ++field8607;
         if (~class175.field2258 == -2) {
            return class345.field4735;
         } else {
            if (arg0 != 100) {
               field8610 = null;
            }

            return class429.field5829;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8612[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "d",
      descriptor = "(I)[B"
   )
   public final byte[] method4356(int arg0) {
      try {
         if (arg0 != -2) {
            this.method4354(-20);
         }

         ++field8603;
         if (super.field11623) {
            throw new RuntimeException();
         } else {
            return this.field8604;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8612[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4357(byte arg0) {
      try {
         field8610 = null;
         if (arg0 != 58) {
            field8610 = null;
         }

         field8611 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8612[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method4358(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8608;
         class487 var4 = class2.method12((long)arg0, 9, (byte)43);
         if (arg3 > -118) {
            method4357((byte)-75);
         }

         var4.method3694(-21792);
         var4.field6794 = arg2;
         var4.field6791 = arg1;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8612[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4359(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4360(char[] arg0) {
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
            var10005 = 5;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
