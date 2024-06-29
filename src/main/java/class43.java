import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public abstract class class43 extends class673 {
   @OriginalMember(
      owner = "client!wca",
      name = "r",
      descriptor = "Liu;"
   )
   public class530 field562;
   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field565 = new String[]{method328(method327("SLY\fF\f")), method328(method327("SLY\fX\f")), method328(method327("SLY\fD\f")), method328(method327("SLY\fG\f")), method328(method327("SLY\fK\f")), method328(method327("SLY\fY\f")), method328(method327("_\u0001\u0016\ft")), method328(method327("JZTN")), method328(method327("SLY\f5MAQV7\f"))};
   @OriginalMember(
      owner = "client!wca",
      name = "p",
      descriptor = "Lse;"
   )
   public static class6 field558 = new class6(91, 16);
   @OriginalMember(
      owner = "client!wca",
      name = "q",
      descriptor = "[Ljava/awt/Rectangle;"
   )
   public static Rectangle[] field563 = new Rectangle[100];
   @OriginalMember(
      owner = "client!wca",
      name = "n",
      descriptor = "I"
   )
   public static int field557;
   @OriginalMember(
      owner = "client!wca",
      name = "t",
      descriptor = "I"
   )
   public static int field559;
   @OriginalMember(
      owner = "client!wca",
      name = "l",
      descriptor = "I"
   )
   public static int field560;
   @OriginalMember(
      owner = "client!wca",
      name = "o",
      descriptor = "I"
   )
   public static int field561;
   @OriginalMember(
      owner = "client!wca",
      name = "m",
      descriptor = "I"
   )
   public static int field564;
   @OriginalMember(
      owner = "client!wca",
      name = "s",
      descriptor = "Z"
   )
   public boolean field556;

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method315(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!wca",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method316(byte arg0) {
      try {
         ++field559;
         int var2 = -105 / ((arg0 - 30) / 53);
         return 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field565[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "d",
      descriptor = "(B)Z"
   )
   public final boolean method317(byte arg0) {
      try {
         ++field557;
         if (arg0 < 97) {
            this.method315(-52, 108, -34);
         }

         return this.field556;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field565[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "b",
      descriptor = "(I)I"
   )
   public int method318(int arg0) {
      try {
         if (arg0 != 1) {
            return 9;
         } else {
            ++field564;
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field565[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(B)Z"
   )
   public abstract boolean method319(byte arg0);

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method320(int arg0) {
      try {
         if (arg0 != 28429) {
            return true;
         } else {
            ++field560;
            return false;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field565[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method321(int arg0);

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         if (arg3 != class757.field11093.field10993.method3351(-18033) && ~arg4 != -1 && ~class128.field1640 > -51 && ~arg1 != 0) {
            client.field1479[class128.field1640++] = new class142((byte)1, arg1, arg4, arg2, arg0, 0, arg5, (class713)null);
         }

         ++field561;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field565[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(Lkk;ILkk;B)V"
   )
   public abstract void method323(class266 arg0, int arg1, class266 arg2, byte arg3);

   @OriginalMember(
      owner = "client!wca",
      name = "c",
      descriptor = "(B)Z"
   )
   public abstract boolean method324(byte arg0);

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(II)V"
   )
   public abstract void method325(int arg0, int arg1);

   @OriginalMember(
      owner = "client!wca",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method326(int arg0) {
      try {
         field563 = null;
         field558 = null;
         int var1 = 76 % ((-65 - arg0) / 42);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field565[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "<init>",
      descriptor = "(Liu;)V"
   )
   public class43(class530 arg0) {
      try {
         this.field562 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field565[8] + (arg0 != null ? field565[6] : field565[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method327(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method328(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
