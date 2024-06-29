import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class511 extends class446 {
   @OriginalMember(
      owner = "client!cw",
      name = "s",
      descriptor = "Ljava/lang/String;"
   )
   private String field7814 = null;
   @OriginalMember(
      owner = "client!cw",
      name = "D",
      descriptor = "J"
   )
   private long field7806 = -1L;
   @OriginalMember(
      owner = "client!cw",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7818 = new String[]{method3975(method3974("oxwU")), method3975(method3974("z#5\u0017\u0006")), method3975(method3974("bz5zS")), method3975(method3974("bz5qS")), method3975(method3974("!`~T\u0019d\u007fuX\u0016d7")), method3975(method3974("bz5xS")), method3975(method3974("lhv[\u001esezJ\u0013;")), method3975(method3974("bz5pS")), method3975(method3974("bz5{S"))};
   @OriginalMember(
      owner = "client!cw",
      name = "z",
      descriptor = "Lpda;"
   )
   public static class395 field7812 = new class395(128);
   @OriginalMember(
      owner = "client!cw",
      name = "B",
      descriptor = "B"
   )
   private byte field7807;
   @OriginalMember(
      owner = "client!cw",
      name = "u",
      descriptor = "I"
   )
   public static int field7809;
   @OriginalMember(
      owner = "client!cw",
      name = "v",
      descriptor = "I"
   )
   public static int field7810;
   @OriginalMember(
      owner = "client!cw",
      name = "x",
      descriptor = "I"
   )
   public static int field7811;
   @OriginalMember(
      owner = "client!cw",
      name = "y",
      descriptor = "I"
   )
   public static int field7813;
   @OriginalMember(
      owner = "client!cw",
      name = "C",
      descriptor = "I"
   )
   private int field7817;
   @OriginalMember(
      owner = "client!cw",
      name = "r",
      descriptor = "Ljava/io/FileOutputStream;"
   )
   public static FileOutputStream field7816;
   @OriginalMember(
      owner = "client!cw",
      name = "w",
      descriptor = "[Lwaa;"
   )
   public static class236[] field7808;
   @OriginalMember(
      owner = "client!cw",
      name = "t",
      descriptor = "[[B"
   )
   public static byte[][] field7815;

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(Lica;I)V",
      line = 7
   )
   public final void method805(class354 arg0, int arg1) {
      try {
         ++field7809;
         if (arg0.method2855(-31007) != 255) {
            --arg0.field5436;
            this.field7806 = arg0.method2898(32109);
         }

         this.field7814 = arg0.method2876(arg1 + 54);
         this.field7817 = arg0.method2848(arg1 + -113);
         this.field7807 = arg0.method2886((byte)88);
         arg0.method2898(32109);
         if (arg1 != 0) {
            method3972(-99);
         }

         if (class239.field3632) {
            System.out.println(field7818[6] + this.field7806 + field7818[4] + this.field7814);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7818[5] + (arg0 != null ? field7818[1] : field7818[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(Lpc;B)I",
      line = 35
   )
   public static final int method3971(class650 arg0, byte arg1) {
      try {
         ++field7811;
         if (arg1 < 66) {
            return 97;
         } else if (class650.field9368 == arg0) {
            return 5120;
         } else if (class650.field9369 != arg0) {
            if (class650.field9370 != arg0) {
               if (class650.field9371 == arg0) {
                  return 5121;
               } else if (class650.field9372 == arg0) {
                  return 5123;
               } else if (class650.field9373 == arg0) {
                  return 5125;
               } else if (class650.field9374 != arg0) {
                  if (class650.field9375 == arg0) {
                     return 5126;
                  } else {
                     throw new IllegalArgumentException("");
                  }
               } else {
                  return 5131;
               }
            } else {
               return 5124;
            }
         } else {
            return 5122;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7818[8] + (arg0 != null ? field7818[1] : field7818[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(ILaka;)V",
      line = 77
   )
   public final void method810(int arg0, class637 arg1) {
      try {
         ++field7813;
         class277 var3 = new class277();
         var3.field4412 = this.field7807;
         var3.field4417 = this.field7814;
         var3.field4413 = this.field7817;
         if (arg0 == 32061) {
            arg1.method4652(var3, 93);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7818[2] + arg0 + ',' + (arg1 != null ? field7818[1] : field7818[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(I)V",
      line = 121
   )
   public static void method3972(int arg0) {
      try {
         field7812 = null;
         field7808 = null;
         field7816 = null;
         if (arg0 <= 2) {
            method3973(8, 57, (byte)-24);
         }

         field7815 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7818[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(IIB)Z",
      line = 138
   )
   public static final boolean method3973(int arg0, int arg1, byte arg2) {
      try {
         ++field7810;
         if (arg2 >= -82) {
            field7812 = null;
         }

         return ~(2048 & arg1) != -1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7818[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3974(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3975(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
