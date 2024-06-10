import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!ra")
public class class39 {
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "a",
      descriptor = "Lsa;"
   )
   public class41 field290;
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "b",
      descriptor = "Lsa;"
   )
   public class41 field291;
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "c",
      descriptor = "Lsa;"
   )
   public class41 field292;
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "d",
      descriptor = "Lsa;"
   )
   public class41 field293;
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "e",
      descriptor = "Lsa;"
   )
   public class41 field294;
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "f",
      descriptor = "Lcb;"
   )
   public static class9 field295;
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "g",
      descriptor = "Lsa;"
   )
   public class41 field296;
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "h",
      descriptor = "Loa;"
   )
   public static class33 field297 = new class33();
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "i",
      descriptor = "Lsa;"
   )
   public class41 field298;
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "j",
      descriptor = "Lsa;"
   )
   public class41 field299;
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "k",
      descriptor = "Lsa;"
   )
   public class41 field300;
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "l",
      descriptor = "I"
   )
   public static int field301;
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "m",
      descriptor = "Laa;"
   )
   public static class2 field302;
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "n",
      descriptor = "Lsa;"
   )
   public class41 field303;
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "o",
      descriptor = "Lsa;"
   )
   public class41 field304;
   @OriginalMember(
      owner = "loginapplet!ra",
      name = "p",
      descriptor = "Lsa;"
   )
   public class41 field305;

   @OriginalMember(
      owner = "loginapplet!ra",
      name = "a",
      descriptor = "(Z)V",
      line = 17
   )
   public static void method187(boolean arg0) {
      try {
         field297 = null;
         field302 = null;
         field295 = null;
         if (!arg0) {
            method188((byte)32, (String)null);
         }

      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ra.B(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ra",
      name = "a",
      descriptor = "(BLjava/lang/String;)Ljava/lang/String;",
      line = 52
   )
   public static final String method188(byte arg0, String arg1) {
      try {
         StringBuffer var2 = new StringBuffer(arg1.length());
         int var3 = 49 % ((arg0 - 65) / 49);

         for(int var4 = 0; var4 < arg1.length(); ++var4) {
            char var5 = arg1.charAt(var4);
            if ((var5 < '0' || ~var5 < -58) && (var5 < 'a' || ~var5 < -123) && (var5 < 'A' || ~var5 < -91)) {
               int var6 = (245 & var5) >> 1917656004;
               var2.append("%");
               if (9 >= var6) {
                  var2.append((char)(48 + var6));
               } else {
                  var2.append((char)(65 + -10 + var6));
               }

               var6 = 15 & var5;
               if (-10 > ~var6) {
                  var2.append((char)(-10 + var6 + 65));
               } else {
                  var2.append((char)(48 + var6));
               }
            } else {
               var2.append(var5);
            }
         }

         return var2.toString();
      } catch (RuntimeException var7) {
         throw class28.method139(var7, "ra.A(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ra",
      name = "<init>",
      descriptor = "([Lsa;Lsa;)V",
      line = 96
   )
   public class39(class41[] arg0, class41 arg1) {
      try {
         if (-9 != ~arg0.length) {
            throw new RuntimeException();
         } else {
            this.field303 = arg0[1];
            this.field296 = arg0[5];
            this.field293 = arg0[7];
            this.field304 = arg0[2];
            this.field290 = arg0[4];
            this.field299 = arg0[6];
            this.field305 = arg0[0];
            this.field298 = arg0[3];
            this.field300 = class14.method79(new class41[]{class15.field120, arg1}, 95);
            this.field294 = class14.method79(new class41[]{class15.field114, arg1}, 95);
            this.field292 = class14.method79(new class41[]{class46.field338, arg1}, 95);
            this.field291 = class14.method79(new class41[]{class15.field118, arg1}, 95);
         }
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "ra.<init>(" + (arg0 != null ? "{...}" : "null") + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }
}
