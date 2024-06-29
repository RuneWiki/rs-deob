import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class589 {
   @OriginalMember(
      owner = "client!k",
      name = "c",
      descriptor = "[I"
   )
   public int[] field8509;
   @OriginalMember(
      owner = "client!k",
      name = "e",
      descriptor = "[I"
   )
   public int[] field8505;
   @OriginalMember(
      owner = "client!k",
      name = "f",
      descriptor = "[I"
   )
   public int[] field8503;
   @OriginalMember(
      owner = "client!k",
      name = "g",
      descriptor = "[I"
   )
   public int[] field8512;
   @OriginalMember(
      owner = "client!k",
      name = "i",
      descriptor = "[S"
   )
   public short[] field8511;
   @OriginalMember(
      owner = "client!k",
      name = "j",
      descriptor = "[S"
   )
   public short[] field8510;
   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8513 = new String[]{method4362(method4361("jEGj")), method4362(method4361("-Kv74o\u0002j%`!")), method4362(method4361("l\u0018")), method4362(method4361("/KP+7dKp#1d\u0005>b")), method4362(method4361("Q\nv63b\u0007ab)x\u0018p'7!\bk74uQ$")), method4362(method4361("zE*l'")), method4362(method4361("D\u0006m6.d\u0019wxz")), method4362(method4361("o\u001eh.")), method4362(method4361("!;e0.h\bh');K")), method4362(method4361("jEEj")), method4362(method4361("jE8+4h\u001f:j")), method4362(method4361("jEFj"))};
   @OriginalMember(
      owner = "client!k",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field8508 = false;
   @OriginalMember(
      owner = "client!k",
      name = "d",
      descriptor = "I"
   )
   public static int field8504;
   @OriginalMember(
      owner = "client!k",
      name = "b",
      descriptor = "I"
   )
   public static int field8506;
   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "Ljava/awt/Frame;"
   )
   public static Frame field8507;

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(Lha;JI)V",
      line = 4
   )
   public static final void method4358(class65 arg0, long arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         class613.field8899 = 0;
         class505.field7351 = 0;
         class37.field894 = class248.field3571;
         ++field8504;
         class248.field3571 = 0;
         long var5 = class57.method650(97);
         class42 var7 = (class42)class513.field7485.method1394((byte)-126);
         if (var4) {
            if (var7.method489(arg0, arg1)) {
               ++class505.field7351;
            }

            var7 = (class42)class513.field7485.method1400(false);
         }

         while(true) {
            boolean var10000;
            if (var7 == null) {
               var10000 = class752.field10825;
               if (!var4) {
                  if (var10000 && arg1 % 100L == 0L) {
                     System.out.println(field8513[4] + class513.field7485.method1396((byte)-126) + field8513[1] + class505.field7351);
                     System.out.println(field8513[6] + class613.field8899 + field8513[8] + class248.field3571 + field8513[3] + (class57.method650(110) - var5) + field8513[2]);
                  }

                  if (arg2 < 90) {
                     method4360(82);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = var7.method489(arg0, arg1);
            }

            if (var10000) {
               ++class505.field7351;
            }

            var7 = (class42)class513.field7485.method1400(false);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field8513[9] + (arg0 != null ? field8513[5] : field8513[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(IZIIII)V",
      line = 39
   )
   public static final void method4359(int param0, boolean param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!k",
      name = "<init>",
      descriptor = "(Lmba;)V",
      line = 183
   )
   public class589(class439 arg0) {
      try {
         this.field8509 = new int[2];
         this.field8505 = new int[2];
         this.field8503 = new int[3];
         this.field8512 = new int[3];
         this.field8503[2] = arg0.field6404;
         this.field8503[0] = arg0.field6339;
         this.field8503[1] = arg0.field6386;
         this.field8512[0] = arg0.field6350;
         this.field8512[1] = arg0.field6381;
         this.field8512[2] = arg0.field6396;
         this.field8509[1] = arg0.field6348;
         this.field8509[0] = arg0.field6408;
         this.field8505[1] = arg0.field6356;
         this.field8505[0] = arg0.field6400;
         if (arg0.field6363 != null) {
            this.field8511 = new short[arg0.field6363.length];
            class365.method2859(arg0.field6363, 0, this.field8511, 0, this.field8511.length);
         }

         if (arg0.field6340 != null) {
            this.field8510 = new short[arg0.field6340.length];
            class365.method2859(arg0.field6340, 0, this.field8510, 0, this.field8510.length);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8513[10] + (arg0 != null ? field8513[5] : field8513[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(I)V",
      line = 217
   )
   public static void method4360(int arg0) {
      try {
         int var1 = -79 / ((arg0 - 24) / 40);
         field8507 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8513[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4361(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4362(char[] arg0) {
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
            var10005 = 107;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
