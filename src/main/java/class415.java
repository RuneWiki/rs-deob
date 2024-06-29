import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class415 {
   @OriginalMember(
      owner = "client!ur",
      name = "d",
      descriptor = "I"
   )
   private int field6441 = -1;
   @OriginalMember(
      owner = "client!ur",
      name = "h",
      descriptor = "Lsn;"
   )
   private class675 field6438 = new class675();
   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6443 = new String[]{method3319(method3318("FtJc+")), method3319(method3318("H(J\u000f~")), method3319(method3318("pj\u0005OPVr\u0010HmTu DoGgJ@sCj\u001dulpj\u0005OPVr\u0010HmTuL\b9\u0013E\u0016DgVh\u0010Hb_uDEl\u0013h\u000bU#^g\u0010Bk\u0012&7DwGo\nFp\u001di\u0013OfA<")), method3319(method3318("]s\bM")), method3319(method3318("\u0013b\u0001MwR(\u000bVmVt^")), method3319(method3318("\u0013s\u0014EbGc*Tn\t")), method3319(method3318("FtJ\u001dj]o\u0010\u001f+")), method3319(method3318("FtJ`+")), method3319(method3318("G<")), method3319(method3318("fh\u0016D`\\a\nHpVbDboRh7DwGo\nFpwc\bUb\u0013r\u001dQf\u0013o\n\u0001gVe\u000bEf\u001b/")), method3319(method3318("FtJb+"))};
   @OriginalMember(
      owner = "client!ur",
      name = "f",
      descriptor = "[[[I"
   )
   public static int[][][] field6437 = new int[2][][];
   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "I"
   )
   public static int field6435;
   @OriginalMember(
      owner = "client!ur",
      name = "b",
      descriptor = "I"
   )
   public static int field6442;
   @OriginalMember(
      owner = "client!ur",
      name = "e",
      descriptor = "J"
   )
   private long field6436;
   @OriginalMember(
      owner = "client!ur",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field6439;
   @OriginalMember(
      owner = "client!ur",
      name = "g",
      descriptor = "[[I"
   )
   public static int[][] field6440;

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3315(int arg0) {
      try {
         field6437 = null;
         field6439 = null;
         field6440 = null;
         if (arg0 != -4) {
            field6437 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6443[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(Lsda;I)V"
   )
   public final void method3316(class223 arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field6435;
         if (~this.field6436 == ~arg0.field3383 && this.field6441 == arg0.field3364) {
            class775 var4 = (class775)this.field6438.method4972((byte)-84);
            if (var3) {
               var4.method1190(arg0, -127);
               var4 = (class775)this.field6438.method4975((byte)97);
            }

            while(true) {
               if (var4 == null) {
                  if (!var3) {
                     if (arg1 > -34) {
                        method3315(-42);
                     }

                     ++arg0.field3364;
                     return;
                  }
               } else {
                  var4.method1190(arg0, -127);
               }

               var4 = (class775)this.field6438.method4975((byte)97);
            }
         } else {
            throw new RuntimeException(field6443[2] + class484.method3768((byte)8, arg0.field3383) + field6443[5] + arg0.field3364 + field6443[4] + class484.method3768((byte)8, this.field6436) + field6443[5] + this.field6441);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6443[0] + (arg0 != null ? field6443[1] : field6443[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(Lica;I)V"
   )
   private final void method3317(class354 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ur",
      name = "<init>",
      descriptor = "(Lica;)V"
   )
   public class415(class354 arg0) {
      try {
         this.method3317(arg0, -128);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6443[6] + (arg0 != null ? field6443[1] : field6443[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3318(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3319(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
