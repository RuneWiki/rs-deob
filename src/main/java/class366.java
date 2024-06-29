import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public class class366 extends class691 {
   @OriginalMember(
      owner = "client!ija",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5023 = new String[]{method2732(method2731("6/\u0014RRw")), method2732(method2731("6/\u0014RPw")), method2732(method2731("6/\u0014RVw")), method2732(method2731("6/\u0014RUw")), method2732(method2731("6/\u0014RTw")), method2732(method2731("6/\u0014RSw")), method2732(method2731("6/\u0014RQw"))};
   @OriginalMember(
      owner = "client!ija",
      name = "r",
      descriptor = "Leg;"
   )
   public static class118 field5016 = new class118(43, -2);
   @OriginalMember(
      owner = "client!ija",
      name = "t",
      descriptor = "I"
   )
   public static int field5014;
   @OriginalMember(
      owner = "client!ija",
      name = "w",
      descriptor = "I"
   )
   public static int field5015;
   @OriginalMember(
      owner = "client!ija",
      name = "s",
      descriptor = "I"
   )
   public static int field5017;
   @OriginalMember(
      owner = "client!ija",
      name = "q",
      descriptor = "I"
   )
   public static int field5019;
   @OriginalMember(
      owner = "client!ija",
      name = "o",
      descriptor = "I"
   )
   public static int field5020;
   @OriginalMember(
      owner = "client!ija",
      name = "p",
      descriptor = "I"
   )
   public static int field5021;
   @OriginalMember(
      owner = "client!ija",
      name = "u",
      descriptor = "I"
   )
   public static int field5022;
   @OriginalMember(
      owner = "client!ija",
      name = "v",
      descriptor = "Lbg;"
   )
   private class492 field5018;

   @OriginalMember(
      owner = "client!ija",
      name = "a",
      descriptor = "(ZIII)V",
      line = 3
   )
   public final void method67(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         class383.field5543.method608(arg1 + -2, arg2, super.field10175.field3731 + 4, super.field10175.field3729 + 2, ((class229)super.field10175).field3225, 0);
         ++field5014;
         if (arg3 != 5178) {
            field5016 = null;
         }

         class383.field5543.method608(arg1 + -1, arg2 + 1, super.field10175.field3731 + 2, super.field10175.field3729, 0, 0);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5023[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "b",
      descriptor = "(I)Z",
      line = 15
   )
   public final boolean method860(int arg0) {
      try {
         ++field5021;
         return !super.method860(arg0) ? false : super.field10173.method2051(((class229)super.field10175).field3229, (byte)60);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5023[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "a",
      descriptor = "(IZIB)V",
      line = 27
   )
   public final void method69(int arg0, boolean arg1, int arg2, byte arg3) {
      try {
         ++field5015;
         if (arg3 == 88) {
            int var5 = this.method5041(97) * super.field10175.field3731 / 10000;
            int[] var6 = new int[4];
            class383.field5543.method605(var6);
            class383.field5543.method592(arg2, arg0 + 2, arg2 + var5, arg0 - -super.field10175.field3729);
            this.field5018.method3569(arg2, arg0 + 2, super.field10175.field3731, super.field10175.field3729);
            class383.field5543.method592(var6[0], var6[1], var6[2], var6[3]);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5023[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "d",
      descriptor = "(I)V",
      line = 45
   )
   public static void method2728(int arg0) {
      try {
         if (arg0 > 92) {
            field5016 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5023[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "a",
      descriptor = "(III)Z",
      line = 55
   )
   public static final boolean method2729(int arg0, int arg1, int arg2) {
      try {
         if (arg0 > -117) {
            field5019 = 49;
         }

         ++field5020;
         return (arg1 & 16) != 0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5023[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "b",
      descriptor = "(B)V",
      line = 67
   )
   public static final void method2730(byte arg0) {
      boolean var1 = client.field4360;

      try {
         if (arg0 != 41) {
            method2729(120, 25, 7);
         }

         ++field5017;
         if (class342.field4643 != null) {
            int var2 = 0;
            if (var1 || ~class342.field4643.length < ~var2) {
               do {
                  int var3 = 0;
                  if (var1) {
                     class342.field4643[var2][var3] = class11.field121;
                     ++var3;
                  }

                  while(true) {
                     while(var3 < class342.field4643[var2].length) {
                        class342.field4643[var2][var3] = class11.field121;
                        ++var3;
                     }

                     if (!var1) {
                        ++var2;
                        break;
                     }

                     ++var3;
                  }
               } while(~class342.field4643.length < ~var2);

            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5023[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "<init>",
      descriptor = "(Lkf;Lkf;Lsba;)V",
      line = 104
   )
   public class366(class266 arg0, class266 arg1, class229 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!ija",
      name = "a",
      descriptor = "(I)V",
      line = 107
   )
   public final void method862(int arg0) {
      try {
         ++field5022;
         if (arg0 != -23681) {
            this.field5018 = null;
         }

         super.method862(arg0);
         this.field5018 = class506.method3671((byte)46, ((class229)super.field10175).field3229, super.field10173);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5023[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2731(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ija",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2732(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
