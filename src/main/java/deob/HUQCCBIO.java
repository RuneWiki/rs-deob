package deob;

@ObfuscatedName("HUQCCBIO")
public class HUQCCBIO {

	@ObfuscatedName("HUQCCBIO.g")
	public int field746 = 0;

	@ObfuscatedName("HUQCCBIO.h")
	public int field747 = 0;

	@ObfuscatedName("HUQCCBIO.i")
	public int field748;

	@ObfuscatedName("HUQCCBIO.j")
	public int field749;

	@ObfuscatedName("HUQCCBIO.k")
	public int[][] field750;

	public HUQCCBIO(int arg0, int arg1) {
		field748 = arg0;
		field749 = arg1;
		field750 = new int[field748][field749];
		method299();
	}

	@ObfuscatedName("HUQCCBIO.a(B)V")
	public void method299() {
		for (int var1 = 0; var1 < field748; var1++) {
			for (int var2 = 0; var2 < field749; var2++) {
				if (var1 == 0 || var2 == 0 || field748 - 1 == var1 || field749 - 1 == var2) {
					field750[var1][var2] = 0xFFFFFF;
				} else {
					field750[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("HUQCCBIO.a(IIIZII)V")
	public void method300(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg1 -= field746;
		arg0 -= field747;
		if (arg4 == 0) {
			if (arg3 == 0) {
				method303(arg1, arg0, 128);
				method303(arg1 - 1, arg0, 8);
			}

			if (arg3 == 1) {
				method303(arg1, arg0, 2);
				method303(arg1, arg0 + 1, 32);
			}

			if (arg3 == 2) {
				method303(arg1, arg0, 8);
				method303(arg1 + 1, arg0, 128);
			}

			if (arg3 == 3) {
				method303(arg1, arg0, 32);
				method303(arg1, arg0 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				method303(arg1, arg0, 1);
				method303(arg1 - 1, arg0 + 1, 16);
			}

			if (arg3 == 1) {
				method303(arg1, arg0, 4);
				method303(arg1 + 1, arg0 + 1, 64);
			}

			if (arg3 == 2) {
				method303(arg1, arg0, 16);
				method303(arg1 + 1, arg0 - 1, 1);
			}

			if (arg3 == 3) {
				method303(arg1, arg0, 64);
				method303(arg1 - 1, arg0 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg3 == 0) {
				method303(arg1, arg0, 130);
				method303(arg1 - 1, arg0, 8);
				method303(arg1, arg0 + 1, 32);
			}

			if (arg3 == 1) {
				method303(arg1, arg0, 10);
				method303(arg1, arg0 + 1, 32);
				method303(arg1 + 1, arg0, 128);
			}

			if (arg3 == 2) {
				method303(arg1, arg0, 40);
				method303(arg1 + 1, arg0, 128);
				method303(arg1, arg0 - 1, 2);
			}

			if (arg3 == 3) {
				method303(arg1, arg0, 160);
				method303(arg1, arg0 - 1, 2);
				method303(arg1 - 1, arg0, 8);
			}
		}

		if (arg2) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					method303(arg1, arg0, 0x10000);
					method303(arg1 - 1, arg0, 4096);
				}

				if (arg3 == 1) {
					method303(arg1, arg0, 1024);
					method303(arg1, arg0 + 1, 16384);
				}

				if (arg3 == 2) {
					method303(arg1, arg0, 4096);
					method303(arg1 + 1, arg0, 0x10000);
				}

				if (arg3 == 3) {
					method303(arg1, arg0, 16384);
					method303(arg1, arg0 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					method303(arg1, arg0, 512);
					method303(arg1 - 1, arg0 + 1, 8192);
				}

				if (arg3 == 1) {
					method303(arg1, arg0, 2048);
					method303(arg1 + 1, arg0 + 1, 32768);
				}

				if (arg3 == 2) {
					method303(arg1, arg0, 8192);
					method303(arg1 + 1, arg0 - 1, 512);
				}

				if (arg3 == 3) {
					method303(arg1, arg0, 32768);
					method303(arg1 - 1, arg0 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg3 == 0) {
					method303(arg1, arg0, 66560);
					method303(arg1 - 1, arg0, 4096);
					method303(arg1, arg0 + 1, 16384);
				}

				if (arg3 == 1) {
					method303(arg1, arg0, 5120);
					method303(arg1, arg0 + 1, 16384);
					method303(arg1 + 1, arg0, 0x10000);
				}

				if (arg3 == 2) {
					method303(arg1, arg0, 20480);
					method303(arg1 + 1, arg0, 0x10000);
					method303(arg1, arg0 - 1, 1024);
				}

				if (arg3 == 3) {
					method303(arg1, arg0, 81920);
					method303(arg1, arg0 - 1, 1024);
					method303(arg1 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("HUQCCBIO.a(ZIIIZII)V")
	public void method301(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg5 -= field746;
		arg0 -= field747;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg1;
			arg1 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg5; var9 < arg1 + arg5; var9++) {
			if (var9 >= 0 && var9 < field748) {
				for (int var10 = arg0; var10 < arg0 + arg2; var10++) {
					if (var10 >= 0 && var10 < field749) {
						method303(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("HUQCCBIO.a(IBI)V")
	public void method302(int arg0, int arg1) {
		arg0 -= field746;
		arg1 -= field747;
		field750[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("HUQCCBIO.a(III)V")
	public void method303(int arg0, int arg1, int arg2) {
		field750[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("HUQCCBIO.a(IZIIII)V")
	public void method304(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg0 -= field746;
		arg2 -= field747;
		if (arg4 == 0) {
			if (arg3 == 0) {
				method306(128, arg2, arg0);
				method306(8, arg2, arg0 - 1);
			}

			if (arg3 == 1) {
				method306(2, arg2, arg0);
				method306(32, arg2 + 1, arg0);
			}

			if (arg3 == 2) {
				method306(8, arg2, arg0);
				method306(128, arg2, arg0 + 1);
			}

			if (arg3 == 3) {
				method306(32, arg2, arg0);
				method306(2, arg2 - 1, arg0);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				method306(1, arg2, arg0);
				method306(16, arg2 + 1, arg0 - 1);
			}

			if (arg3 == 1) {
				method306(4, arg2, arg0);
				method306(64, arg2 + 1, arg0 + 1);
			}

			if (arg3 == 2) {
				method306(16, arg2, arg0);
				method306(1, arg2 - 1, arg0 + 1);
			}

			if (arg3 == 3) {
				method306(64, arg2, arg0);
				method306(4, arg2 - 1, arg0 - 1);
			}
		}

		if (arg4 == 2) {
			if (arg3 == 0) {
				method306(130, arg2, arg0);
				method306(8, arg2, arg0 - 1);
				method306(32, arg2 + 1, arg0);
			}

			if (arg3 == 1) {
				method306(10, arg2, arg0);
				method306(32, arg2 + 1, arg0);
				method306(128, arg2, arg0 + 1);
			}

			if (arg3 == 2) {
				method306(40, arg2, arg0);
				method306(128, arg2, arg0 + 1);
				method306(2, arg2 - 1, arg0);
			}

			if (arg3 == 3) {
				method306(160, arg2, arg0);
				method306(2, arg2 - 1, arg0);
				method306(8, arg2, arg0 - 1);
			}
		}

		if (arg1) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					method306(0x10000, arg2, arg0);
					method306(4096, arg2, arg0 - 1);
				}

				if (arg3 == 1) {
					method306(1024, arg2, arg0);
					method306(16384, arg2 + 1, arg0);
				}

				if (arg3 == 2) {
					method306(4096, arg2, arg0);
					method306(0x10000, arg2, arg0 + 1);
				}

				if (arg3 == 3) {
					method306(16384, arg2, arg0);
					method306(1024, arg2 - 1, arg0);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					method306(512, arg2, arg0);
					method306(8192, arg2 + 1, arg0 - 1);
				}

				if (arg3 == 1) {
					method306(2048, arg2, arg0);
					method306(32768, arg2 + 1, arg0 + 1);
				}

				if (arg3 == 2) {
					method306(8192, arg2, arg0);
					method306(512, arg2 - 1, arg0 + 1);
				}

				if (arg3 == 3) {
					method306(32768, arg2, arg0);
					method306(2048, arg2 - 1, arg0 - 1);
				}
			}

			if (arg4 == 2) {
				if (arg3 == 0) {
					method306(66560, arg2, arg0);
					method306(4096, arg2, arg0 - 1);
					method306(16384, arg2 + 1, arg0);
				}

				if (arg3 == 1) {
					method306(5120, arg2, arg0);
					method306(16384, arg2 + 1, arg0);
					method306(0x10000, arg2, arg0 + 1);
				}

				if (arg3 == 2) {
					method306(20480, arg2, arg0);
					method306(0x10000, arg2, arg0 + 1);
					method306(1024, arg2 - 1, arg0);
				}

				if (arg3 == 3) {
					method306(81920, arg2, arg0);
					method306(1024, arg2 - 1, arg0);
					method306(4096, arg2, arg0 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("HUQCCBIO.a(IIIIIIZ)V")
	public void method305(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg0 -= field746;
		arg3 -= field747;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg2;
			arg2 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg2; var9++) {
			if (var9 >= 0 && var9 < field748) {
				for (int var10 = arg3; var10 < arg1 + arg3; var10++) {
					if (var10 >= 0 && var10 < field749) {
						method306(var7, var10, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("HUQCCBIO.a(IIII)V")
	public void method306(int arg0, int arg1, int arg2) {
		field750[arg2][arg1] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("HUQCCBIO.a(IZI)V")
	public void method307(int arg0, int arg1) {
		arg0 -= field746;
		arg1 -= field747;
		field750[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("HUQCCBIO.a(IIIIIIB)Z")
	public boolean method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg3 && arg4 == arg5) {
			return true;
		}

		arg2 -= field746;
		arg4 -= field747;
		arg3 -= field746;
		arg5 -= field747;
		if (arg0 == 0) {
			if (arg1 == 0) {
				if (arg3 - 1 == arg2 && arg4 == arg5) {
					return true;
				}

				if (arg2 == arg3 && arg5 + 1 == arg4 && (field750[arg2][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg5 - 1 == arg4 && (field750[arg2][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg2 == arg3 && arg5 + 1 == arg4) {
					return true;
				}

				if (arg3 - 1 == arg2 && arg4 == arg5 && (field750[arg2][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg2 && arg4 == arg5 && (field750[arg2][arg4] & 0x280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg3 + 1 == arg2 && arg4 == arg5) {
					return true;
				}

				if (arg2 == arg3 && arg5 + 1 == arg4 && (field750[arg2][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg5 - 1 == arg4 && (field750[arg2][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg2 == arg3 && arg5 - 1 == arg4) {
					return true;
				}

				if (arg3 - 1 == arg2 && arg4 == arg5 && (field750[arg2][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg2 && arg4 == arg5 && (field750[arg2][arg4] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 2) {
			if (arg1 == 0) {
				if (arg3 - 1 == arg2 && arg4 == arg5) {
					return true;
				}

				if (arg2 == arg3 && arg5 + 1 == arg4) {
					return true;
				}

				if (arg3 + 1 == arg2 && arg4 == arg5 && (field750[arg2][arg4] & 0x280180) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg5 - 1 == arg4 && (field750[arg2][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg3 - 1 == arg2 && arg4 == arg5 && (field750[arg2][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg5 + 1 == arg4) {
					return true;
				}

				if (arg3 + 1 == arg2 && arg4 == arg5) {
					return true;
				}

				if (arg2 == arg3 && arg5 - 1 == arg4 && (field750[arg2][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg3 - 1 == arg2 && arg4 == arg5 && (field750[arg2][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg5 + 1 == arg4 && (field750[arg2][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg2 && arg4 == arg5) {
					return true;
				}

				if (arg2 == arg3 && arg5 - 1 == arg4) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg3 - 1 == arg2 && arg4 == arg5) {
					return true;
				}

				if (arg2 == arg3 && arg5 + 1 == arg4 && (field750[arg2][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg2 && arg4 == arg5 && (field750[arg2][arg4] & 0x280180) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg5 - 1 == arg4) {
					return true;
				}
			}
		}

		if (arg0 == 9) {
			if (arg2 == arg3 && arg5 + 1 == arg4 && (field750[arg2][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg3 && arg5 - 1 == arg4 && (field750[arg2][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg2 && arg4 == arg5 && (field750[arg2][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg2 && arg4 == arg5 && (field750[arg2][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("HUQCCBIO.a(IIIZIII)Z")
	public boolean method309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg5 && arg2 == arg4) {
			return true;
		}

		arg5 -= field746;
		arg2 -= field747;
		arg3 -= field746;
		arg4 -= field747;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg3 + 1 == arg5 && arg2 == arg4 && (field750[arg5][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg4 - 1 == arg2 && (field750[arg5][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg3 - 1 == arg5 && arg2 == arg4 && (field750[arg5][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg4 - 1 == arg2 && (field750[arg5][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg3 - 1 == arg5 && arg2 == arg4 && (field750[arg5][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg4 + 1 == arg2 && (field750[arg5][arg2] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg3 + 1 == arg5 && arg2 == arg4 && (field750[arg5][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg4 + 1 == arg2 && (field750[arg5][arg2] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 8) {
			if (arg3 == arg5 && arg4 + 1 == arg2 && (field750[arg5][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg5 && arg4 - 1 == arg2 && (field750[arg5][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg5 && arg2 == arg4 && (field750[arg5][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg5 && arg2 == arg4 && (field750[arg5][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("HUQCCBIO.a(IIIIIIII)Z")
	public boolean method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg5 - 1;
		int var9 = arg4 + arg6 - 1;
		if (arg1 >= arg5 && arg1 <= var8 && arg3 >= arg4 && arg3 <= var9) {
			return true;
		}

		if (arg5 - 1 == arg1 && arg3 >= arg4 && arg3 <= var9 && (field750[arg1 - field746][arg3 - field747] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg1 && arg3 >= arg4 && arg3 <= var9 && (field750[arg1 - field746][arg3 - field747] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		}

		if (arg4 - 1 == arg3 && arg1 >= arg5 && arg1 <= var8 && (field750[arg1 - field746][arg3 - field747] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg3 && arg1 >= arg5 && arg1 <= var8 && (field750[arg1 - field746][arg3 - field747] & 0x20) == 0 && (arg2 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
