import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class557 {
   @OriginalMember(
      owner = "client!tp",
      name = "i",
      descriptor = "Lgw;"
   )
   private class179 field8087 = new class179(16);
   @OriginalMember(
      owner = "client!tp",
      name = "f",
      descriptor = "Lhw;"
   )
   private class141 field8085;
   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8089 = new String[]{method4159(method4158("\u0001RqzQ")), method4159(method4158("\u0001Rq|Q")), method4159(method4158("\u0001Rq~Q")), method4159(method4158("\u001bW3W")), method4159(method4158("\u0001RqxQ")), method4159(method4158("\u000e\fq\u0015\u0004")), method4159(method4158("\u0001Rq\u007fQ")), method4159(method4158("\u0001RqyQ")), method4159(method4158("\u0001Rq}Q")), method4159(method4158("\u0001Rq\u0007\u0010\u001bK+\u0005Q"))};
   @OriginalMember(
      owner = "client!tp",
      name = "k",
      descriptor = "Lqh;"
   )
   public static class74 field8079 = new class74();
   @OriginalMember(
      owner = "client!tp",
      name = "c",
      descriptor = "Luw;"
   )
   public static class435 field8088 = new class435(26, 3);
   @OriginalMember(
      owner = "client!tp",
      name = "h",
      descriptor = "I"
   )
   public static int field8078;
   @OriginalMember(
      owner = "client!tp",
      name = "d",
      descriptor = "I"
   )
   public static int field8080;
   @OriginalMember(
      owner = "client!tp",
      name = "e",
      descriptor = "I"
   )
   public static int field8081;
   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "I"
   )
   public static int field8082;
   @OriginalMember(
      owner = "client!tp",
      name = "j",
      descriptor = "I"
   )
   public static int field8083;
   @OriginalMember(
      owner = "client!tp",
      name = "b",
      descriptor = "I"
   )
   public static int field8084;
   @OriginalMember(
      owner = "client!tp",
      name = "g",
      descriptor = "I"
   )
   public static int field8086;

   @OriginalMember(
      owner = "client!tp",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method4151(byte arg0) {
      try {
         class179 var2 = this.field8087;
         synchronized(this.field8087) {
            if (arg0 <= 8) {
               return;
            }

            this.field8087.method1591((byte)58);
         }

         ++field8081;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8089[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method4152(int arg0, byte arg1) {
      try {
         int var2 = -6 / ((46 - arg1) / 41);
         ++field8082;
         return arg0 != 1 && ~arg0 != -8;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8089[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method4153(int arg0, int arg1) {
      try {
         class179 var3 = this.field8087;
         synchronized(this.field8087) {
            this.field8087.method1579(-51, arg1);
         }

         ++field8084;
         if (arg0 > -50) {
            method4156(26);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8089[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(IILar;III)Lbh;"
   )
   public final class40 method4154(int arg0, int arg1, class709 arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field4564;

      try {
         ++field8078;
         if (arg5 != -19512) {
            return null;
         } else {
            class378[] var8 = null;
            class534 var9 = this.method4157(arg0, true);
            if (var9.field7779 != null) {
               var8 = new class378[var9.field7779.length];
               int var10 = 0;
               if (var7 || ~var8.length < ~var10) {
                  do {
                     class581 var11 = arg2.method5153((byte)-125, var9.field7779[var10]);
                     var8[var10] = new class378(var11.field8340, var11.field8348, var11.field8349, var11.field8341, var11.field8343, var11.field8346, var11.field8342, var11.field8353);
                     ++var10;
                  } while(~var8.length < ~var10);
               }
            }

            return new class40(var9.field7775, var8, var9.field7782, arg1, arg3, arg4);
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field8089[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8089[5] : field8089[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4155(byte arg0) {
      try {
         ++field8086;
         class179 var2 = this.field8087;
         synchronized(this.field8087) {
            this.field8087.method1589((byte)59);
            if (arg0 != -125) {
               field8088 = null;
            }

         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8089[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4156(int arg0) {
      try {
         field8079 = null;
         if (arg0 <= 46) {
            field8079 = null;
         }

         field8088 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8089[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V"
   )
   public class557(class320 arg0, int arg1, class141 arg2) {
      try {
         this.field8085 = arg2;
         this.field8085.method1346(29, 0);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8089[9] + (arg0 != null ? field8089[5] : field8089[3]) + ',' + arg1 + ',' + (arg2 != null ? field8089[5] : field8089[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(IZ)Ldk;"
   )
   private final class534 method4157(int arg0, boolean arg1) {
      try {
         ++field8083;
         class179 var3 = this.field8087;
         class534 var4;
         synchronized(this.field8087) {
            var4 = (class534)this.field8087.method1584((long)arg0, 1);
            if (!arg1) {
               this.field8087 = null;
            }
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field8085;
            byte[] var6;
            synchronized(this.field8085) {
               var6 = this.field8085.method1347((byte)125, 29, arg0);
            }

            class534 var7 = new class534();
            if (var6 != null) {
               var7.method3997(new class473(var6), 14671);
            }

            class179 var8 = this.field8087;
            synchronized(this.field8087) {
               this.field8087.method1581((long)arg0, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field8089[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4158(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4159(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
