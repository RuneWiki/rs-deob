import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class156 {
   @OriginalMember(
      owner = "client!pj",
      name = "i",
      descriptor = "I"
   )
   private int field1979 = 0;
   @OriginalMember(
      owner = "client!pj",
      name = "d",
      descriptor = "I"
   )
   private int field1985 = 0;
   @OriginalMember(
      owner = "client!pj",
      name = "e",
      descriptor = "I"
   )
   private int field1987 = 0;
   @OriginalMember(
      owner = "client!pj",
      name = "g",
      descriptor = "Lck;"
   )
   private class667 field1986;
   @OriginalMember(
      owner = "client!pj",
      name = "j",
      descriptor = "Lae;"
   )
   private class262 field1977;
   @OriginalMember(
      owner = "client!pj",
      name = "a",
      descriptor = "[Lve;"
   )
   private class529[] field1983;
   @OriginalMember(
      owner = "client!pj",
      name = "k",
      descriptor = "Lue;"
   )
   public class242 field1978;
   @OriginalMember(
      owner = "client!pj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1988 = new String[]{method1297(method1296("W]\u001c\u001fQ")), method1297(method1296("W]\u001cb\u0010I^F`Q")), method1297(method1296("\\\u0019\u001cp\u0004")), method1297(method1296("IB^2")), method1297(method1296("W]\u001c\u001dQ")), method1297(method1296("W]\u001c\u001aQ")), method1297(method1296("W]\u001c\u001cQ"))};
   @OriginalMember(
      owner = "client!pj",
      name = "c",
      descriptor = "I"
   )
   public static int field1980;
   @OriginalMember(
      owner = "client!pj",
      name = "f",
      descriptor = "I"
   )
   public static int field1981;
   @OriginalMember(
      owner = "client!pj",
      name = "h",
      descriptor = "I"
   )
   public static int field1982;
   @OriginalMember(
      owner = "client!pj",
      name = "b",
      descriptor = "I"
   )
   public static int field1984;

   @OriginalMember(
      owner = "client!pj",
      name = "a",
      descriptor = "(IB)Z",
      line = 3
   )
   public final boolean method1292(int arg0, byte arg1) {
      try {
         ++field1981;
         return arg1 >= -74 ? true : this.field1983[arg0].method873(0);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1988[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pj",
      name = "a",
      descriptor = "(III)Z",
      line = 14
   )
   public static final boolean method1293(int arg0, int arg1, int arg2) {
      try {
         ++field1984;
         if (arg0 != 55) {
            return false;
         } else {
            return ~(2048 & arg2) != -1 && (arg1 & 55) != 0;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1988[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pj",
      name = "a",
      descriptor = "(BILbca;)Z",
      line = 26
   )
   public final boolean method1294(byte arg0, int arg1, class689 arg2) {
      try {
         ++field1982;
         if (~this.field1985 == -1) {
            return false;
         } else {
            this.field1983[Integer.MAX_VALUE & this.field1985].method870(arg1, arg2, -1);
            if (arg0 < 45) {
               this.method1295((byte)-64, 114, false, -13, 36, true);
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1988[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1988[2] : field1988[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pj",
      name = "a",
      descriptor = "(BIZIIZ)V",
      line = 47
   )
   public final void method1295(byte arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field1980;
         boolean var9 = arg2 & this.field1986.method649();
         if (!var9 && (arg3 == 4 || arg3 == 8 || ~arg3 == -10)) {
            if (arg3 == 4) {
               arg4 = arg1;
            }

            arg3 = 2;
         }

         if (arg0 >= 70) {
            if (arg3 != 0 && arg5) {
               arg3 |= Integer.MIN_VALUE;
            }

            if (~this.field1985 == ~arg3) {
               if (~this.field1985 != -1) {
                  this.field1983[this.field1985 & Integer.MAX_VALUE].method872(103, arg5);
                  if (~this.field1987 != ~arg1 || this.field1979 != arg4) {
                     this.field1983[this.field1985 & Integer.MAX_VALUE].method871(arg1, 113, arg4);
                     this.field1987 = arg1;
                     this.field1979 = arg4;
                  }

                  return;
               }
            } else {
               if (~this.field1985 != -1) {
                  this.field1983[Integer.MAX_VALUE & this.field1985].method874(1);
               }

               if (arg3 != 0) {
                  this.field1983[arg3 & Integer.MAX_VALUE].method878(0, arg5);
                  this.field1983[arg3 & Integer.MAX_VALUE].method872(13, arg5);
                  this.field1983[arg3 & Integer.MAX_VALUE].method871(arg1, 126, arg4);
               }

               this.field1985 = arg3;
               this.field1979 = arg4;
               this.field1987 = arg1;
            }

         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1988[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pj",
      name = "<init>",
      descriptor = "(Lck;)V",
      line = 116
   )
   public class156(class667 arg0) {
      try {
         this.field1986 = arg0;
         this.field1977 = new class262(arg0);
         this.field1983 = new class529[10];
         this.field1983[1] = new class100(arg0);
         this.field1983[2] = new class695(arg0, this.field1977);
         this.field1983[4] = new class500(arg0, this.field1977);
         this.field1983[5] = new class232(arg0, this.field1977);
         this.field1983[6] = new class515(arg0);
         this.field1983[7] = new class336(arg0);
         this.field1983[3] = this.field1978 = new class242(arg0);
         this.field1983[8] = new class595(arg0, this.field1977);
         this.field1983[9] = new class241(arg0, this.field1977);
         if (!this.field1983[8].method873(0)) {
            this.field1983[8] = this.field1983[4];
         }

         if (!this.field1983[9].method873(0)) {
            this.field1983[9] = this.field1983[8];
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1988[1] + (arg0 != null ? field1988[2] : field1988[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1296(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1297(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
