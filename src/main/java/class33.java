import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public abstract class class33 extends class297 {
   @OriginalMember(
      owner = "client!kj",
      name = "v",
      descriptor = "I"
   )
   public int field416;
   @OriginalMember(
      owner = "client!kj",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field419 = new String[]{method251(method250("}i*\u007f0xjp}q")), method251(method250("}i*\u0002q")), method251(method250("}i*\u0005q")), method251(method250("}i*\u0006q")), method251(method250("}i*\u0001q"))};
   @OriginalMember(
      owner = "client!kj",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field412 = new int[2];
   @OriginalMember(
      owner = "client!kj",
      name = "x",
      descriptor = "I"
   )
   public static int field414;
   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "I"
   )
   public static int field417;
   @OriginalMember(
      owner = "client!kj",
      name = "w",
      descriptor = "I"
   )
   public static int field418;
   @OriginalMember(
      owner = "client!kj",
      name = "A",
      descriptor = "[Laaa;"
   )
   public static class743[] field413;
   @OriginalMember(
      owner = "client!kj",
      name = "y",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field415;

   @OriginalMember(
      owner = "client!kj",
      name = "g",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public abstract Object method244(int arg0);

   @OriginalMember(
      owner = "client!kj",
      name = "c",
      descriptor = "(I)Z"
   )
   public abstract boolean method245(int arg0);

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method246(byte arg0) throws class623 {
      try {
         ++field417;
         if (arg0 != -80) {
            field415 = null;
         }

         if (~class67.field883 == -2) {
            class450.field6888.method699(class656.field9793, class177.field2773);
         } else {
            class450.field6888.method699(0, 0);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field419[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method247(int arg0, int arg1) {
      try {
         ++field414;
         if (class342.field5204 == arg0) {
            if (~class519.field7897 == -1 && ~class159.field2363 == -1) {
               class444.field6812 = arg1;
               class69.method532(1, 9);
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field419[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method248(byte arg0) {
      try {
         field412 = null;
         if (arg0 != 55) {
            field412 = null;
         }

         field413 = null;
         field415 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field419[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method249(int arg0, byte arg1) {
      try {
         if (arg1 != -62) {
            method248((byte)-95);
         }

         ++field418;
         return 255 & arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field419[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class33(int arg0) {
      try {
         this.field416 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field419[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method250(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method251(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
