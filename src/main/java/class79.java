import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class79 {
   @OriginalMember(
      owner = "client!oi",
      name = "c",
      descriptor = "I"
   )
   private int field983;
   @OriginalMember(
      owner = "client!oi",
      name = "i",
      descriptor = "I"
   )
   private int field981;
   @OriginalMember(
      owner = "client!oi",
      name = "k",
      descriptor = "I"
   )
   private int field984;
   @OriginalMember(
      owner = "client!oi",
      name = "m",
      descriptor = "I"
   )
   private int field985;
   @OriginalMember(
      owner = "client!oi",
      name = "h",
      descriptor = "I"
   )
   public int field986;
   @OriginalMember(
      owner = "client!oi",
      name = "l",
      descriptor = "I"
   )
   public int field990;
   @OriginalMember(
      owner = "client!oi",
      name = "j",
      descriptor = "I"
   )
   public int field988;
   @OriginalMember(
      owner = "client!oi",
      name = "e",
      descriptor = "I"
   )
   public int field980;
   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "I"
   )
   public int field979;
   @OriginalMember(
      owner = "client!oi",
      name = "g",
      descriptor = "I"
   )
   public int field982;
   @OriginalMember(
      owner = "client!oi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field992 = new String[]{method767(method766("o}Z\u0003")), method767(method766("na\u0018-A")), method767(method766("z&\u0018A\u0014")), method767(method766("na\u0018,A")), method767(method766("na\u0018S\u0000oaBQA")), method767(method766("na\u0018+A")), method767(method766("na\u0018.A"))};
   @OriginalMember(
      owner = "client!oi",
      name = "f",
      descriptor = "[C"
   )
   public static char[] field989 = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
   @OriginalMember(
      owner = "client!oi",
      name = "b",
      descriptor = "I"
   )
   public static int field978;
   @OriginalMember(
      owner = "client!oi",
      name = "d",
      descriptor = "I"
   )
   public static int field987;
   @OriginalMember(
      owner = "client!oi",
      name = "n",
      descriptor = "I"
   )
   public static int field991;

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method762(byte arg0) {
      try {
         field989 = null;
         if (arg0 < 22) {
            method762((byte)-105);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field992[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public final boolean method763(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field991;
         if (~arg0 <= ~this.field986 && arg0 <= this.field988) {
            if (this.field980 <= arg1 && ~this.field990 <= ~arg1) {
               if (~this.field982 >= ~arg3 && ~this.field979 <= ~arg3) {
                  int var5 = -this.field983 + arg0;
                  int var6 = -this.field985 + arg3;
                  int var7 = -49 % ((arg2 - -56) / 40);
                  return ~(var5 * var5 + var6 * var6) > ~this.field984;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field992[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(IIIIIIIIIII)V"
   )
   public final void method764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      try {
         this.field981 = arg3;
         this.field984 = arg1 * arg1;
         if (arg10 == -29001) {
            ++field978;
            this.field983 = arg4;
            this.field985 = arg5;
            this.field988 = this.field983 + arg2;
            this.field982 = this.field985 + arg8;
            this.field980 = this.field981 + arg7;
            this.field979 = this.field985 + arg0;
            this.field990 = this.field981 + arg9;
            this.field986 = this.field983 + arg6;
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field992[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(Lqh;ZLqh;Lqh;Lqh;)V"
   )
   public static final void method765(class74 arg0, boolean arg1, class74 arg2, class74 arg3, class74 arg4) {
      try {
         class350.field5019 = arg0;
         class567.field7737 = arg4;
         if (!arg1) {
            method765((class74)null, true, (class74)null, (class74)null, (class74)null);
         }

         ++field987;
         class639.field9016 = arg3;
         class468.field6451 = new class657[class639.field9016.method719(arg1)][];
         class388.field5433 = new boolean[class639.field9016.method719(true)];
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field992[1] + (arg0 != null ? field992[2] : field992[0]) + ',' + arg1 + ',' + (arg2 != null ? field992[2] : field992[0]) + ',' + (arg3 != null ? field992[2] : field992[0]) + ',' + (arg4 != null ? field992[2] : field992[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "<init>",
      descriptor = "(IIIIIIIIII)V"
   )
   public class79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         this.field983 = arg0;
         this.field981 = arg1;
         this.field984 = arg3 * arg3;
         this.field985 = arg2;
         this.field986 = this.field983 + arg4;
         this.field990 = this.field981 + arg7;
         this.field988 = this.field983 + arg5;
         this.field980 = this.field981 + arg6;
         this.field979 = this.field985 - -arg9;
         this.field982 = this.field985 - -arg8;
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field992[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method766(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method767(char[] arg0) {
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
            var10005 = 8;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
