import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class403 {
   @OriginalMember(
      owner = "client!bp",
      name = "j",
      descriptor = "I"
   )
   private int field5966 = 0;
   @OriginalMember(
      owner = "client!bp",
      name = "d",
      descriptor = "I"
   )
   private int field5965 = 0;
   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "I"
   )
   private int field5960 = 0;
   @OriginalMember(
      owner = "client!bp",
      name = "g",
      descriptor = "Lrk;"
   )
   private class35 field5969;
   @OriginalMember(
      owner = "client!bp",
      name = "i",
      descriptor = "Ltaa;"
   )
   private class426 field5963;
   @OriginalMember(
      owner = "client!bp",
      name = "h",
      descriptor = "[Lnb;"
   )
   private class316[] field5962;
   @OriginalMember(
      owner = "client!bp",
      name = "e",
      descriptor = "Lip;"
   )
   public class734 field5964;
   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5971 = new String[]{method3111(method3110("\u001cH~\u0010p")), method3111(method3110("\u001cH~\u0016p")), method3111(method3110("\u0010M<8")), method3111(method3110("\u0005\u0016~z%")), method3111(method3110("\u001cH~\u0015p")), method3111(method3110("\u001cH~h1\u0010Q$jp")), method3111(method3110("\u001cH~\u0017p"))};
   @OriginalMember(
      owner = "client!bp",
      name = "f",
      descriptor = "I"
   )
   public static int field5961;
   @OriginalMember(
      owner = "client!bp",
      name = "c",
      descriptor = "I"
   )
   public static int field5967;
   @OriginalMember(
      owner = "client!bp",
      name = "k",
      descriptor = "I"
   )
   public static int field5968;
   @OriginalMember(
      owner = "client!bp",
      name = "b",
      descriptor = "I"
   )
   public static int field5970;

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(II)Z",
      line = 8
   )
   public final boolean method3106(int arg0, int arg1) {
      try {
         int var3 = 29 / ((arg0 - -53) / 60);
         ++field5967;
         return this.field5962[arg1].method807(-18913);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5971[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(Lufa;II)Z",
      line = 24
   )
   public final boolean method3107(class707 arg0, int arg1, int arg2) {
      try {
         if (arg2 != 16213) {
            this.field5960 = 63;
         }

         ++field5968;
         if (this.field5960 == 0) {
            return false;
         } else {
            this.field5962[Integer.MAX_VALUE & this.field5960].method804(0, arg1, arg0);
            return true;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5971[4] + (arg0 != null ? field5971[3] : field5971[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "<init>",
      descriptor = "(Lrk;)V",
      line = 118
   )
   public class403(class35 arg0) {
      try {
         this.field5969 = arg0;
         this.field5963 = new class426(arg0);
         this.field5962 = new class316[10];
         this.field5962[1] = new class634(arg0);
         this.field5962[2] = new class728(arg0, this.field5963);
         this.field5962[4] = new class131(arg0, this.field5963);
         this.field5962[5] = new class80(arg0, this.field5963);
         this.field5962[6] = new class283(arg0);
         this.field5962[7] = new class158(arg0);
         this.field5962[3] = this.field5964 = new class734(arg0);
         this.field5962[8] = new class231(arg0, this.field5963);
         this.field5962[9] = new class433(arg0, this.field5963);
         if (!this.field5962[8].method807(-18913)) {
            this.field5962[8] = this.field5962[4];
         }

         if (!this.field5962[9].method807(-18913)) {
            this.field5962[9] = this.field5962[8];
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5971[5] + (arg0 != null ? field5971[3] : field5971[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(ZIZIII)V",
      line = 48
   )
   public final void method3108(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
      try {
         int var7 = -117 / ((arg5 - -77) / 33);
         boolean var10 = arg0 & this.field5969.method386();
         ++field5961;
         if (!var10 && (~arg4 == -5 || arg4 == 8 || arg4 == 9)) {
            if (arg4 == 4) {
               arg3 = arg1;
            }

            arg4 = 2;
         }

         if (arg4 != 0 && arg2) {
            arg4 |= Integer.MIN_VALUE;
         }

         if (~this.field5960 != ~arg4) {
            if (~this.field5960 != -1) {
               this.field5962[this.field5960 & Integer.MAX_VALUE].method805(107);
            }

            if (arg4 != 0) {
               this.field5962[Integer.MAX_VALUE & arg4].method806((byte)-93, arg2);
               this.field5962[arg4 & Integer.MAX_VALUE].method811((byte)51, arg2);
               this.field5962[arg4 & Integer.MAX_VALUE].method810(arg1, arg3, 0);
            }

            this.field5966 = arg1;
            this.field5960 = arg4;
            this.field5965 = arg3;
         } else if (~this.field5960 != -1) {
            this.field5962[Integer.MAX_VALUE & this.field5960].method811((byte)51, arg2);
            if (~this.field5966 != ~arg1 || this.field5965 != arg3) {
               this.field5962[this.field5960 & Integer.MAX_VALUE].method810(arg1, arg3, 0);
               this.field5965 = arg3;
               this.field5966 = arg1;
            }

         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field5971[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(I)Z",
      line = 106
   )
   public static final boolean method3109(int arg0) {
      try {
         ++class718.field10372;
         class52.field1078 = true;
         ++field5970;
         return arg0 == -1;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5971[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3110(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3111(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
