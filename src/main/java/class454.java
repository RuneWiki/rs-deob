import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class class454 {
   @OriginalMember(
      owner = "client!bj",
      name = "d",
      descriptor = "Lme;"
   )
   public class752 field6259;
   @OriginalMember(
      owner = "client!bj",
      name = "f",
      descriptor = "I"
   )
   public int field6263;
   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6266 = new String[]{method3483(method3482("TC^E")), method3483(method3482("X\\\u001c\u0015LT_F\u0017\r")), method3483(method3482("A\u0018\u001c\u0007X")), method3483(method3482("X\\\u001cb\r")), method3483(method3482("X\\\u001cd\r")), method3483(method3482("X\\\u001ce\r")), method3483(method3482("X\\\u001c`\r")), method3483(method3482("X\\\u001cc\r"))};
   @OriginalMember(
      owner = "client!bj",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field6261 = new int[2];
   @OriginalMember(
      owner = "client!bj",
      name = "e",
      descriptor = "I"
   )
   public static int field6260;
   @OriginalMember(
      owner = "client!bj",
      name = "b",
      descriptor = "I"
   )
   public static int field6262;
   @OriginalMember(
      owner = "client!bj",
      name = "g",
      descriptor = "I"
   )
   public static int field6264;
   @OriginalMember(
      owner = "client!bj",
      name = "h",
      descriptor = "I"
   )
   public static int field6265;
   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "Lgg;"
   )
   public static class120 field6258;

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(IZ)I"
   )
   public abstract int method24(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3477(byte arg0) {
      try {
         field6258 = null;
         if (arg0 >= 75) {
            field6261 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6266[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(BI)V"
   )
   public abstract void method20(byte arg0, int arg1);

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3478(int arg0, int arg1) {
      try {
         ++field6262;
         if (this.method24(arg1, false) != 3) {
            this.method20((byte)-109, arg1);
         }

         if (arg0 != 7807) {
            field6261 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6266[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(IIFIIIIFIFFLeo;[BF)V"
   )
   public static final void method3479(int param0, int param1, float param2, int param3, int param4, int param5, int param6, float param7, int param8, float param9, float param10, class726 param11, byte[] param12, float param13) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bj",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class454(class752 arg0) {
      try {
         this.field6259 = arg0;
         this.field6263 = this.method23(1);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6266[1] + (arg0 != null ? field6266[2] : field6266[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class454(int arg0, class752 arg1) {
      try {
         this.field6263 = arg0;
         this.field6259 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6266[1] + arg0 + ',' + (arg1 != null ? field6266[2] : field6266[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method28(boolean arg0);

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(I)I"
   )
   public abstract int method23(int arg0);

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(ILjava/io/File;I)[B"
   )
   public static final byte[] method3480(int arg0, File arg1, int arg2) {
      try {
         ++field6264;

         try {
            if (arg0 != 0) {
               field6261 = null;
            }

            byte[] var3 = new byte[arg2];
            class555.method4191(arg2, var3, arg1, 68);
            return var3;
         } catch (IOException var5) {
            return null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6266[4] + arg0 + ',' + (arg1 != null ? field6266[2] : field6266[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method3481(int arg0, byte arg1) {
      try {
         int var2 = 49 % ((7 - arg1) / 56);
         ++field6265;
         class576.field8546 = new int[arg0];
         class499.field6959 = new int[arg0];
         class248.field3133 = new int[arg0];
         class44.field573 = new int[arg0];
         class156.field2019 = new int[arg0];
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6266[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3482(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3483(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
