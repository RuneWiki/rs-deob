import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class293 extends class70 {
   @OriginalMember(
      owner = "client!qg",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4651 = new String[]{method2474(method2473("\u001aP^\r]")), method2474(method2473("\u001aP^\u0003]")), method2474(method2473("\u0005B\u001c'")), method2474(method2473("\u0010\u0019^e\b")), method2474(method2473("\u001aP^\u0001]")), method2474(method2473("\u001aP^\f]")), method2474(method2473("\u001aP^w\u001c\u0005^\u0004u]")), method2474(method2473("\u001aP^\u000e]")), method2474(method2473("\u001aP^\n]"))};
   @OriginalMember(
      owner = "client!qg",
      name = "I",
      descriptor = "I"
   )
   public static int field4639;
   @OriginalMember(
      owner = "client!qg",
      name = "R",
      descriptor = "I"
   )
   public static int field4640;
   @OriginalMember(
      owner = "client!qg",
      name = "P",
      descriptor = "I"
   )
   private int field4642;
   @OriginalMember(
      owner = "client!qg",
      name = "J",
      descriptor = "I"
   )
   public static int field4643;
   @OriginalMember(
      owner = "client!qg",
      name = "G",
      descriptor = "I"
   )
   public static int field4645;
   @OriginalMember(
      owner = "client!qg",
      name = "F",
      descriptor = "I"
   )
   public static int field4647;
   @OriginalMember(
      owner = "client!qg",
      name = "O",
      descriptor = "I"
   )
   public static int field4648;
   @OriginalMember(
      owner = "client!qg",
      name = "Q",
      descriptor = "I"
   )
   private int field4649;
   @OriginalMember(
      owner = "client!qg",
      name = "N",
      descriptor = "I"
   )
   private int field4650;
   @OriginalMember(
      owner = "client!qg",
      name = "L",
      descriptor = "Lcia;"
   )
   public static class101 field4644;
   @OriginalMember(
      owner = "client!qg",
      name = "H",
      descriptor = "Lrr;"
   )
   public static class678 field4641;
   @OriginalMember(
      owner = "client!qg",
      name = "M",
      descriptor = "[Lvl;"
   )
   public static class409[] field4646;

   @OriginalMember(
      owner = "client!qg",
      name = "<init>",
      descriptor = "(I)V",
      line = 6
   )
   private class293(int arg0) {
      super(0, false);

      try {
         this.method2469(8120, arg0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4651[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(Llb;)V",
      line = 20
   )
   public static final void method2468(class246 arg0) {
      class154.field2298 = arg0;
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(IILica;)V",
      line = 23
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         ++field4645;
         if (arg0 == -1) {
            if (~arg1 == -1) {
               this.method2469(8120, arg2.method2872(arg0 + 3));
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4651[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4651[3] : field4651[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "<init>",
      descriptor = "()V",
      line = 50
   )
   public class293() {
      this(0);
   }

   @OriginalMember(
      owner = "client!qg",
      name = "b",
      descriptor = "(II)V",
      line = 53
   )
   private final void method2469(int arg0, int arg1) {
      try {
         ++field4639;
         if (arg0 == 8120) {
            this.field4650 = (arg1 & 16711680) >> 12;
            this.field4642 = (arg1 & 255) << 4;
            this.field4649 = (arg1 & 65280) >> 4;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4651[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(II)[[I",
      line = 66
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field4643;
         int[][] var4 = super.field918.method3276((byte)105, arg1);
         if (arg0 != 32) {
            method2470(23, 13, (byte)55);
         }

         if (super.field918.field6361) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = 0;
            if (var3 || class678.field10127 > var8) {
               do {
                  var5[var8] = this.field4650;
                  var6[var8] = this.field4649;
                  var7[var8] = this.field4642;
                  ++var8;
               } while(class678.field10127 > var8);
            }
         }

         return var4;
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field4651[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "b",
      descriptor = "(IIB)B",
      line = 105
   )
   public static final byte method2470(int arg0, int arg1, byte arg2) {
      try {
         ++field4648;
         if (arg1 != 9) {
            return 0;
         } else {
            if (arg2 >= -32) {
               field4646 = null;
            }

            return (byte)(~(1 & arg0) != -1 ? 2 : 1);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4651[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "g",
      descriptor = "(I)V",
      line = 124
   )
   public static void method2471(int arg0) {
      try {
         field4646 = null;
         field4641 = null;
         field4644 = null;
         if (arg0 <= 78) {
            method2471(85);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4651[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "b",
      descriptor = "(III)Z",
      line = 137
   )
   public static final boolean method2472(int arg0, int arg1, int arg2) {
      try {
         ++field4647;
         if (arg2 > -83) {
            method2472(79, -98, 45);
         }

         return (458752 & arg1) != 0 | class536.method4115(arg0, arg1, -61) || class508.method3945(arg0, -2108543543, arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4651[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2473(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2474(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
