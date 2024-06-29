import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class24 {
   @OriginalMember(
      owner = "client!qo",
      name = "h",
      descriptor = "I"
   )
   public int field301 = 128;
   @OriginalMember(
      owner = "client!qo",
      name = "d",
      descriptor = "I"
   )
   public int field306 = 128;
   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "I"
   )
   public int field303;
   @OriginalMember(
      owner = "client!qo",
      name = "c",
      descriptor = "I"
   )
   public int field304;
   @OriginalMember(
      owner = "client!qo",
      name = "k",
      descriptor = "I"
   )
   public int field305;
   @OriginalMember(
      owner = "client!qo",
      name = "l",
      descriptor = "I"
   )
   public int field310;
   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field313 = new String[]{method211(method210("DO8\f")), method211(method210("[Uz#S")), method211(method210("Q\u0014zN\u0006")), method211(method210("[Uz\\\u0012DS ^S")), method211(method210("[Uz!S")), method211(method210("[Uz\"S"))};
   @OriginalMember(
      owner = "client!qo",
      name = "i",
      descriptor = "I"
   )
   public static int field307;
   @OriginalMember(
      owner = "client!qo",
      name = "f",
      descriptor = "I"
   )
   public static int field311;
   @OriginalMember(
      owner = "client!qo",
      name = "g",
      descriptor = "Ldk;"
   )
   public static class540 field302;
   @OriginalMember(
      owner = "client!qo",
      name = "e",
      descriptor = "[Lu;"
   )
   public static class80[] field308;
   @OriginalMember(
      owner = "client!qo",
      name = "b",
      descriptor = "[[S"
   )
   public static short[][] field309;
   @OriginalMember(
      owner = "client!qo",
      name = "j",
      descriptor = "[[[I"
   )
   public static int[][][] field312;

   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "(I)Lqo;"
   )
   public final class24 method207(int arg0) {
      try {
         ++field307;
         if (arg0 > -99) {
            this.field304 = 92;
         }

         return new class24(this.field303, this.field301, this.field306, this.field310, this.field305, this.field304);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field313[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "(Lqo;I)V"
   )
   public final void method208(class24 arg0, int arg1) {
      try {
         this.field304 = arg0.field304;
         if (arg1 == 128) {
            this.field301 = arg0.field301;
            ++field311;
            this.field306 = arg0.field306;
            this.field310 = arg0.field310;
            this.field305 = arg0.field305;
            this.field303 = arg0.field303;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field313[1] + (arg0 != null ? field313[2] : field313[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method209(byte arg0) {
      try {
         field308 = null;
         field302 = null;
         field312 = null;
         field309 = null;
         if (arg0 > -36) {
            field312 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field313[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class24(int arg0) {
      try {
         this.field303 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field313[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   private class24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field304 = arg5;
         this.field305 = arg4;
         this.field301 = arg1;
         this.field303 = arg0;
         this.field310 = arg3;
         this.field306 = arg2;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field313[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method210(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method211(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
