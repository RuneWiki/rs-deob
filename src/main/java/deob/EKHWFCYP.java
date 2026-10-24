package deob;

@ObfuscatedName("EKHWFCYP")
public class EKHWFCYP {

	@ObfuscatedName("EKHWFCYP.g")
	public int field568 = 0;

	@ObfuscatedName("EKHWFCYP.h")
	public int field569 = 0;

	@ObfuscatedName("EKHWFCYP.i")
	public int field570;

	@ObfuscatedName("EKHWFCYP.j")
	public int field571;

	@ObfuscatedName("EKHWFCYP.k")
	public int[][] field572;

	public EKHWFCYP(int arg0, int arg1) {
		field570 = arg0;
		field571 = arg1;
		field572 = new int[field570][field571];
		method191();
	}

	@ObfuscatedName("EKHWFCYP.a()V")
	public void method191() {
		for (int var1 = 0; var1 < field570; var1++) {
			for (int var2 = 0; var2 < field571; var2++) {
				if (var1 == 0 || var2 == 0 || field570 - 1 == var1 || field571 - 1 == var2) {
					field572[var1][var2] = 0xFFFFFF;
				} else {
					field572[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("EKHWFCYP.a(IIZIII)V")
	public void method192(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg0 -= field568;
		arg3 -= field569;
		if (arg1 == 0) {
			if (arg4 == 0) {
				method195(arg0, arg3, 128);
				method195(arg0 - 1, arg3, 8);
			}

			if (arg4 == 1) {
				method195(arg0, arg3, 2);
				method195(arg0, arg3 + 1, 32);
			}

			if (arg4 == 2) {
				method195(arg0, arg3, 8);
				method195(arg0 + 1, arg3, 128);
			}

			if (arg4 == 3) {
				method195(arg0, arg3, 32);
				method195(arg0, arg3 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				method195(arg0, arg3, 1);
				method195(arg0 - 1, arg3 + 1, 16);
			}

			if (arg4 == 1) {
				method195(arg0, arg3, 4);
				method195(arg0 + 1, arg3 + 1, 64);
			}

			if (arg4 == 2) {
				method195(arg0, arg3, 16);
				method195(arg0 + 1, arg3 - 1, 1);
			}

			if (arg4 == 3) {
				method195(arg0, arg3, 64);
				method195(arg0 - 1, arg3 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg4 == 0) {
				method195(arg0, arg3, 130);
				method195(arg0 - 1, arg3, 8);
				method195(arg0, arg3 + 1, 32);
			}

			if (arg4 == 1) {
				method195(arg0, arg3, 10);
				method195(arg0, arg3 + 1, 32);
				method195(arg0 + 1, arg3, 128);
			}

			if (arg4 == 2) {
				method195(arg0, arg3, 40);
				method195(arg0 + 1, arg3, 128);
				method195(arg0, arg3 - 1, 2);
			}

			if (arg4 == 3) {
				method195(arg0, arg3, 160);
				method195(arg0, arg3 - 1, 2);
				method195(arg0 - 1, arg3, 8);
			}
		}

		if (arg2) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					method195(arg0, arg3, 0x10000);
					method195(arg0 - 1, arg3, 4096);
				}

				if (arg4 == 1) {
					method195(arg0, arg3, 1024);
					method195(arg0, arg3 + 1, 16384);
				}

				if (arg4 == 2) {
					method195(arg0, arg3, 4096);
					method195(arg0 + 1, arg3, 0x10000);
				}

				if (arg4 == 3) {
					method195(arg0, arg3, 16384);
					method195(arg0, arg3 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					method195(arg0, arg3, 512);
					method195(arg0 - 1, arg3 + 1, 8192);
				}

				if (arg4 == 1) {
					method195(arg0, arg3, 2048);
					method195(arg0 + 1, arg3 + 1, 32768);
				}

				if (arg4 == 2) {
					method195(arg0, arg3, 8192);
					method195(arg0 + 1, arg3 - 1, 512);
				}

				if (arg4 == 3) {
					method195(arg0, arg3, 32768);
					method195(arg0 - 1, arg3 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg4 == 0) {
					method195(arg0, arg3, 66560);
					method195(arg0 - 1, arg3, 4096);
					method195(arg0, arg3 + 1, 16384);
				}

				if (arg4 == 1) {
					method195(arg0, arg3, 5120);
					method195(arg0, arg3 + 1, 16384);
					method195(arg0 + 1, arg3, 0x10000);
				}

				if (arg4 == 2) {
					method195(arg0, arg3, 20480);
					method195(arg0 + 1, arg3, 0x10000);
					method195(arg0, arg3 - 1, 1024);
				}

				if (arg4 == 3) {
					method195(arg0, arg3, 81920);
					method195(arg0, arg3 - 1, 1024);
					method195(arg0 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("EKHWFCYP.a(IIIIIZI)V")
	public void method193(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg0 -= field568;
		arg3 -= field569;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg1;
			arg1 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg1; var9++) {
			if (var9 >= 0 && var9 < field570) {
				for (int var10 = arg3; var10 < arg2 + arg3; var10++) {
					if (var10 >= 0 && var10 < field571) {
						method195(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("EKHWFCYP.a(III)V")
	public void method194(int arg0, int arg1) {
		arg1 -= field568;
		arg0 -= field569;
		field572[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("EKHWFCYP.b(III)V")
	public void method195(int arg0, int arg1, int arg2) {
		field572[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("EKHWFCYP.a(IIBIIZ)V")
	public void method196(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg0 -= field568;
		arg3 -= field569;
		if (arg1 == 0) {
			if (arg2 == 0) {
				method198(arg3, 128, arg0);
				method198(arg3, 8, arg0 - 1);
			}

			if (arg2 == 1) {
				method198(arg3, 2, arg0);
				method198(arg3 + 1, 32, arg0);
			}

			if (arg2 == 2) {
				method198(arg3, 8, arg0);
				method198(arg3, 128, arg0 + 1);
			}

			if (arg2 == 3) {
				method198(arg3, 32, arg0);
				method198(arg3 - 1, 2, arg0);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				method198(arg3, 1, arg0);
				method198(arg3 + 1, 16, arg0 - 1);
			}

			if (arg2 == 1) {
				method198(arg3, 4, arg0);
				method198(arg3 + 1, 64, arg0 + 1);
			}

			if (arg2 == 2) {
				method198(arg3, 16, arg0);
				method198(arg3 - 1, 1, arg0 + 1);
			}

			if (arg2 == 3) {
				method198(arg3, 64, arg0);
				method198(arg3 - 1, 4, arg0 - 1);
			}
		}

		if (arg1 == 2) {
			if (arg2 == 0) {
				method198(arg3, 130, arg0);
				method198(arg3, 8, arg0 - 1);
				method198(arg3 + 1, 32, arg0);
			}

			if (arg2 == 1) {
				method198(arg3, 10, arg0);
				method198(arg3 + 1, 32, arg0);
				method198(arg3, 128, arg0 + 1);
			}

			if (arg2 == 2) {
				method198(arg3, 40, arg0);
				method198(arg3, 128, arg0 + 1);
				method198(arg3 - 1, 2, arg0);
			}

			if (arg2 == 3) {
				method198(arg3, 160, arg0);
				method198(arg3 - 1, 2, arg0);
				method198(arg3, 8, arg0 - 1);
			}
		}

		if (arg4) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					method198(arg3, 0x10000, arg0);
					method198(arg3, 4096, arg0 - 1);
				}

				if (arg2 == 1) {
					method198(arg3, 1024, arg0);
					method198(arg3 + 1, 16384, arg0);
				}

				if (arg2 == 2) {
					method198(arg3, 4096, arg0);
					method198(arg3, 0x10000, arg0 + 1);
				}

				if (arg2 == 3) {
					method198(arg3, 16384, arg0);
					method198(arg3 - 1, 1024, arg0);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					method198(arg3, 512, arg0);
					method198(arg3 + 1, 8192, arg0 - 1);
				}

				if (arg2 == 1) {
					method198(arg3, 2048, arg0);
					method198(arg3 + 1, 32768, arg0 + 1);
				}

				if (arg2 == 2) {
					method198(arg3, 8192, arg0);
					method198(arg3 - 1, 512, arg0 + 1);
				}

				if (arg2 == 3) {
					method198(arg3, 32768, arg0);
					method198(arg3 - 1, 2048, arg0 - 1);
				}
			}

			if (arg1 == 2) {
				if (arg2 == 0) {
					method198(arg3, 66560, arg0);
					method198(arg3, 4096, arg0 - 1);
					method198(arg3 + 1, 16384, arg0);
				}

				if (arg2 == 1) {
					method198(arg3, 5120, arg0);
					method198(arg3 + 1, 16384, arg0);
					method198(arg3, 0x10000, arg0 + 1);
				}

				if (arg2 == 2) {
					method198(arg3, 20480, arg0);
					method198(arg3, 0x10000, arg0 + 1);
					method198(arg3 - 1, 1024, arg0);
				}

				if (arg2 == 3) {
					method198(arg3, 81920, arg0);
					method198(arg3 - 1, 1024, arg0);
					method198(arg3, 4096, arg0 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("EKHWFCYP.a(IIIIIIZ)V")
	public void method197(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg0 -= field568;
		arg3 -= field569;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg2;
			arg2 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg2; var9++) {
			if (var9 >= 0 && var9 < field570) {
				for (int var10 = arg3; var10 < arg3 + arg4; var10++) {
					if (var10 >= 0 && var10 < field571) {
						method198(var10, var7, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("EKHWFCYP.a(IIII)V")
	public void method198(int arg0, int arg1, int arg2) {
		field572[arg2][arg0] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("EKHWFCYP.c(III)V")
	public void method199(int arg0, int arg1) {
		arg1 -= field568;
		arg0 -= field569;
		field572[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("EKHWFCYP.a(IIIIIII)Z")
	public boolean method200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg5 && arg3 == arg4) {
			return true;
		}

		arg2 -= field568;
		arg4 -= field569;
		arg5 -= field568;
		arg3 -= field569;
		if (arg0 == 0) {
			if (arg1 == 0) {
				if (arg5 - 1 == arg2 && arg3 == arg4) {
					return true;
				}

				if (arg2 == arg5 && arg3 + 1 == arg4 && (field572[arg2][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg3 - 1 == arg4 && (field572[arg2][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg2 == arg5 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg5 - 1 == arg2 && arg3 == arg4 && (field572[arg2][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg2 && arg3 == arg4 && (field572[arg2][arg4] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg5 + 1 == arg2 && arg3 == arg4) {
					return true;
				}

				if (arg2 == arg5 && arg3 + 1 == arg4 && (field572[arg2][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg3 - 1 == arg4 && (field572[arg2][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg2 == arg5 && arg3 - 1 == arg4) {
					return true;
				}

				if (arg5 - 1 == arg2 && arg3 == arg4 && (field572[arg2][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg2 && arg3 == arg4 && (field572[arg2][arg4] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 2) {
			if (arg1 == 0) {
				if (arg5 - 1 == arg2 && arg3 == arg4) {
					return true;
				}

				if (arg2 == arg5 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg5 + 1 == arg2 && arg3 == arg4 && (field572[arg2][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg3 - 1 == arg4 && (field572[arg2][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg5 - 1 == arg2 && arg3 == arg4 && (field572[arg2][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg5 + 1 == arg2 && arg3 == arg4) {
					return true;
				}

				if (arg2 == arg5 && arg3 - 1 == arg4 && (field572[arg2][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg5 - 1 == arg2 && arg3 == arg4 && (field572[arg2][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg3 + 1 == arg4 && (field572[arg2][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg2 && arg3 == arg4) {
					return true;
				}

				if (arg2 == arg5 && arg3 - 1 == arg4) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg5 - 1 == arg2 && arg3 == arg4) {
					return true;
				}

				if (arg2 == arg5 && arg3 + 1 == arg4 && (field572[arg2][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg2 && arg3 == arg4 && (field572[arg2][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg3 - 1 == arg4) {
					return true;
				}
			}
		}

		if (arg0 == 9) {
			if (arg2 == arg5 && arg3 + 1 == arg4 && (field572[arg2][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg5 && arg3 - 1 == arg4 && (field572[arg2][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg2 && arg3 == arg4 && (field572[arg2][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg2 && arg3 == arg4 && (field572[arg2][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("EKHWFCYP.b(IIIIIII)Z")
	public boolean method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg4 && arg0 == arg5) {
			return true;
		}

		arg4 -= field568;
		arg5 -= field569;
		arg3 -= field568;
		arg0 -= field569;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}

			if (arg2 == 0) {
				if (arg3 + 1 == arg4 && arg0 == arg5 && (field572[arg4][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 - 1 == arg5 && (field572[arg4][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg3 - 1 == arg4 && arg0 == arg5 && (field572[arg4][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 - 1 == arg5 && (field572[arg4][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg3 - 1 == arg4 && arg0 == arg5 && (field572[arg4][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 + 1 == arg5 && (field572[arg4][arg5] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg3 + 1 == arg4 && arg0 == arg5 && (field572[arg4][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 + 1 == arg5 && (field572[arg4][arg5] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 8) {
			if (arg3 == arg4 && arg0 + 1 == arg5 && (field572[arg4][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg4 && arg0 - 1 == arg5 && (field572[arg4][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg4 && arg0 == arg5 && (field572[arg4][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg4 && arg0 == arg5 && (field572[arg4][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("EKHWFCYP.a(IIIIIIZI)Z")
	public boolean method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg3 + arg4 - 1;
		int var9 = arg0 + arg5 - 1;
		if (arg2 >= arg3 && arg2 <= var8 && arg1 >= arg5 && arg1 <= var9) {
			return true;
		}

		if (arg3 - 1 == arg2 && arg1 >= arg5 && arg1 <= var9 && (field572[arg2 - field568][arg1 - field569] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg2 && arg1 >= arg5 && arg1 <= var9 && (field572[arg2 - field568][arg1 - field569] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		}

		if (arg5 - 1 == arg1 && arg2 >= arg3 && arg2 <= var8 && (field572[arg2 - field568][arg1 - field569] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg1 && arg2 >= arg3 && arg2 <= var8 && (field572[arg2 - field568][arg1 - field569] & 0x20) == 0 && (arg6 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
