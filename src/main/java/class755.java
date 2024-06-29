import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class755 extends class345 {
   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10969 = new String[]{method5473(method5472("_\"Zn\u0003")), method5473(method5472("_\"Zj\u0003")), method5473(method5472("_\"Zg\u0003")), method5473(method5472("_\"Zh\u0003")), method5473(method5472("_\"Zk\u0003")), method5473(method5472("_\"Zm\u0003")), method5473(method5472("_\"Zo\u0003"))};
   @OriginalMember(
      owner = "client!hb",
      name = "s",
      descriptor = "Lgh;"
   )
   public static class572 field10966 = new class572(128, 5);
   @OriginalMember(
      owner = "client!hb",
      name = "i",
      descriptor = "I"
   )
   public static int field10958;
   @OriginalMember(
      owner = "client!hb",
      name = "n",
      descriptor = "I"
   )
   public static int field10959;
   @OriginalMember(
      owner = "client!hb",
      name = "r",
      descriptor = "I"
   )
   public static int field10960;
   @OriginalMember(
      owner = "client!hb",
      name = "l",
      descriptor = "I"
   )
   public static int field10961;
   @OriginalMember(
      owner = "client!hb",
      name = "p",
      descriptor = "I"
   )
   public static int field10962;
   @OriginalMember(
      owner = "client!hb",
      name = "j",
      descriptor = "I"
   )
   public static int field10963;
   @OriginalMember(
      owner = "client!hb",
      name = "k",
      descriptor = "I"
   )
   public static int field10964;
   @OriginalMember(
      owner = "client!hb",
      name = "m",
      descriptor = "I"
   )
   public static int field10965;
   @OriginalMember(
      owner = "client!hb",
      name = "q",
      descriptor = "I"
   )
   public static int field10967;
   @OriginalMember(
      owner = "client!hb",
      name = "o",
      descriptor = "I"
   )
   public static int field10968;

   @OriginalMember(
      owner = "client!hb",
      name = "b",
      descriptor = "(B)Z",
      line = 5
   )
   public final boolean method5469(byte arg0) {
      try {
         if (arg0 >= -127) {
            return true;
         } else {
            ++field10961;
            if (super.field4914.method5561(0) == class459.field6730) {
               return !super.field4914.method5560(13750);
            } else {
               return false;
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10969[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "b",
      descriptor = "(I)V",
      line = 26
   )
   public final void method51(int arg0) {
      try {
         label31: {
            if (super.field4914.method5561(arg0) == class459.field6730) {
               if (!super.field4914.method5560(13750)) {
                  break label31;
               }

               super.field4913 = 0;
               if (!client.field4564) {
                  break label31;
               }
            }

            super.field4913 = 1;
         }

         if (arg0 == 0) {
            ++field10963;
            if (~super.field4913 != -1 && super.field4913 != 1) {
               super.field4913 = this.method53(false);
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10969[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(BI)I",
      line = 49
   )
   public final int method52(byte arg0, int arg1) {
      try {
         if (arg0 > -45) {
            return 116;
         } else {
            ++field10962;
            if (super.field4914.method5561(0) == class459.field6730) {
               if (super.field4914.method5560(13750)) {
                  return 3;
               } else {
                  return ~arg1 != -1 && super.field4914.field11175.method2967(false) != 1 ? 2 : 1;
               }
            } else {
               return 3;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10969[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 72
   )
   public class755(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!hb",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 75
   )
   public class755(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(IB)V",
      line = 80
   )
   public final void method54(int arg0, byte arg1) {
      try {
         ++field10959;
         if (arg1 >= 99) {
            super.field4913 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10969[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "b",
      descriptor = "(Z)I",
      line = 93
   )
   public final int method5470(boolean arg0) {
      try {
         if (arg0) {
            this.method53(true);
         }

         ++field10964;
         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10969[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(Z)I",
      line = 106
   )
   public final int method53(boolean arg0) {
      try {
         ++field10960;
         return arg0 ? 51 : 1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10969[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(B)V",
      line = 122
   )
   public static void method5471(byte arg0) {
      try {
         if (arg0 != -60) {
            method5471((byte)-84);
         }

         field10966 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10969[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5472(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5473(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
