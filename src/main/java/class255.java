import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class255 {
   @OriginalMember(
      owner = "client!eia",
      name = "j",
      descriptor = "Loi;"
   )
   private class80 field3468 = new class80(64);
   @OriginalMember(
      owner = "client!eia",
      name = "d",
      descriptor = "Loi;"
   )
   public class80 field3475 = new class80(60);
   @OriginalMember(
      owner = "client!eia",
      name = "h",
      descriptor = "Lkf;"
   )
   private class266 field3474;
   @OriginalMember(
      owner = "client!eia",
      name = "m",
      descriptor = "Lkf;"
   )
   public class266 field3471;
   @OriginalMember(
      owner = "client!eia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3477 = new String[]{method1955(method1954("<nAj;")), method1955(method1954("\")\u000ejz..\u00060xo")), method1955(method1954(")5\u0003(")), method1955(method1954("\")\u000ej\u0002o")), method1955(method1954("\")\u000ej\u0005o")), method1955(method1954("\")\u000ej\u0000o")), method1955(method1954("\")\u000ej\u0004o")), method1955(method1954("\")\u000ej\u0003o")), method1955(method1954("\")\u000ej\u0007o"))};
   @OriginalMember(
      owner = "client!eia",
      name = "g",
      descriptor = "[C"
   )
   public static char[] field3470 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   @OriginalMember(
      owner = "client!eia",
      name = "e",
      descriptor = "Leg;"
   )
   public static class118 field3473 = new class118(83, 6);
   @OriginalMember(
      owner = "client!eia",
      name = "b",
      descriptor = "I"
   )
   public static int field3464;
   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "I"
   )
   public static int field3465;
   @OriginalMember(
      owner = "client!eia",
      name = "i",
      descriptor = "I"
   )
   public static int field3466;
   @OriginalMember(
      owner = "client!eia",
      name = "l",
      descriptor = "I"
   )
   public static int field3467;
   @OriginalMember(
      owner = "client!eia",
      name = "f",
      descriptor = "I"
   )
   public static int field3469;
   @OriginalMember(
      owner = "client!eia",
      name = "c",
      descriptor = "I"
   )
   public static int field3472;
   @OriginalMember(
      owner = "client!eia",
      name = "k",
      descriptor = "I"
   )
   public int field3476;

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(I)V",
      line = 5
   )
   public static void method1948(int arg0) {
      try {
         field3470 = null;
         if (arg0 == 30719) {
            field3473 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3477[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "b",
      descriptor = "(II)Lkja;",
      line = 18
   )
   public final class686 method1949(int arg0, int arg1) {
      try {
         ++field3464;
         class80 var3 = this.field3468;
         class686 var4;
         synchronized(this.field3468) {
            var4 = (class686)this.field3468.method725(0, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field3474;
            byte[] var6;
            synchronized(this.field3474) {
               if (arg1 <= 38) {
                  this.method1949(120, -34);
               }

               var6 = this.field3474.method2037(false, class140.method1110(arg0, 255), class97.method822((byte)-116, arg0));
            }

            class686 var7 = new class686();
            var7.field10126 = arg0;
            var7.field10118 = this;
            if (var6 != null) {
               var7.method5013(0, new class147(var6));
            }

            class80 var8 = this.field3468;
            synchronized(this.field3468) {
               this.field3468.method723(0, (long)arg0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field3477[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(II)V",
      line = 51
   )
   public final void method1950(int arg0, int arg1) {
      try {
         this.field3476 = arg1;
         ++field3467;
         int var3 = 32 % ((12 - arg0) / 48);
         class80 var4 = this.field3475;
         synchronized(this.field3475) {
            this.field3475.method731(0);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3477[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(B)V",
      line = 69
   )
   public final void method1951(byte arg0) {
      try {
         ++field3466;
         class80 var2 = this.field3468;
         synchronized(this.field3468) {
            this.field3468.method731(0);
         }

         if (arg0 != -1) {
            this.field3475 = null;
         }

         class80 var3 = this.field3475;
         synchronized(this.field3475) {
            this.field3475.method731(0);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3477[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "c",
      descriptor = "(II)V",
      line = 85
   )
   public final void method1952(int arg0, int arg1) {
      try {
         class80 var3 = this.field3468;
         synchronized(this.field3468) {
            this.field3468.method726(arg0, 25324);
         }

         if (arg1 != 48) {
            this.method1950(72, -93);
         }

         ++field3469;
         class80 var4 = this.field3475;
         synchronized(this.field3475) {
            this.field3475.method726(arg0, 25324);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field3477[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "b",
      descriptor = "(I)V",
      line = 102
   )
   public final void method1953(int arg0) {
      try {
         ++field3465;
         class80 var2 = this.field3468;
         synchronized(this.field3468) {
            this.field3468.method715(true);
         }

         class80 var3 = this.field3475;
         synchronized(this.field3475) {
            if (arg0 == -3330) {
               this.field3475.method715(true);
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field3477[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "<init>",
      descriptor = "(Lno;ILkf;Lkf;)V",
      line = 135
   )
   public class255(class732 arg0, int arg1, class266 arg2, class266 arg3) {
      try {
         this.field3474 = arg2;
         this.field3471 = arg3;
         int var5 = this.field3474.method2027((byte)-120) + -1;
         this.field3474.method2060(2, var5);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3477[1] + (arg0 != null ? field3477[0] : field3477[2]) + ',' + arg1 + ',' + (arg2 != null ? field3477[0] : field3477[2]) + ',' + (arg3 != null ? field3477[0] : field3477[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1954(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1955(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
